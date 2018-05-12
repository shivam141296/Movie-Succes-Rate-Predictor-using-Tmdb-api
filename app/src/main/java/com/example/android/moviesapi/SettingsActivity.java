package com.example.android.moviesapi;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by user on 28-04-2018.
 */

public class SettingsActivity extends AppCompatActivity {

    private static final String TAG = "SettingsActivity";
    @InjectView(R.id.actor1)
    EditText _actor1;
    @InjectView(R.id.actor2)
    EditText _actor2;
    @InjectView(R.id.actor3)
    EditText _actor3;
    @InjectView(R.id.director)
    EditText _director;
    @InjectView(R.id.budget)
    EditText _budget;
    @InjectView(R.id.runtime)
    EditText _runtime;
    @InjectView(R.id.btn_predict) Button _btnpredict;

    static final int INTERNET_REQ = 23;
    static final String REQ_TAG = "VACTIVITY";
    TextView serverResp;
    RequestQueue requestQueue;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_yourprediction);
        ButterKnife.inject(this);
        serverResp = (TextView) findViewById(R.id.server_resp);
        serverResp.setMovementMethod(new ScrollingMovementMethod());
        requestQueue = RequestQueueSingleton.getInstance(this.getApplicationContext())
                .getRequestQueue();

        _btnpredict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String actor1 = _actor1.getText().toString();
                if(!actor1.isEmpty())
                getJsonResponsePost(v);
                else
                    Toast.makeText(SettingsActivity.this, "Fields empty", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    protected void onStop() {
        super.onStop();
        if (requestQueue != null) {
            requestQueue.cancelAll(REQ_TAG);
        }
    }

    public void predict() {
        Log.d(TAG, "Predict");


        //_btnpredict.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(SettingsActivity.this,
                R.style.Theme_AppCompat_DayNight_DarkActionBar);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Predicting .....");
        progressDialog.show();


    }

    public void getJsonResponsePost(View v) {
        String actor1 = _actor1.getText().toString();
        String actor2 = _actor2.getText().toString();
        String actor3 = _actor3.getText().toString();
        String director = _director.getText().toString();
        String budget = _budget.getText().toString();
        String runtime = _runtime.getText().toString();
        JSONObject json = new JSONObject();
        try {
            json.put("actor1", actor1);
            json.put("actor2", actor2);
            json.put("actor3", actor3);
            json.put("director", director);
            json.put("budget",budget);
            json.put("runtime",runtime);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        String url = getResources().getString(R.string.json_get_url);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, json,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            if(response.get("prediction").toString()=="0")
                            serverResp.setText("Flop");
                            else if(response.get("prediction").toString()=="1")
                                serverResp.setText("Average");
                            else if(response.get("prediction").toString()=="2")
                                serverResp.setText("Hit");
                            else if(response.get("prediction").toString()=="3")
                                serverResp.setText("Super Hit");
                            else
                                serverResp.setText("Blockbuster");

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                serverResp.setText("Error getting response");
            }
        });
        jsonObjectRequest.setTag(REQ_TAG);
        requestQueue.add(jsonObjectRequest);
    }
}
