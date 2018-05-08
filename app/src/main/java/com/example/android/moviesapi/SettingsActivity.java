package com.example.android.moviesapi;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by user on 28-04-2018.
 */

public class SettingsActivity extends AppCompatActivity{

    private static final String TAG = "SettingsActivity";
    @InjectView(R.id.actor1) EditText _actor1;
    @InjectView(R.id.actor2) EditText _actor2;
    @InjectView(R.id.actor3) EditText _actor3;
    @InjectView(R.id.director) EditText _director;
    @InjectView(R.id.budget) EditText _budget;
    @InjectView(R.id.runtime) EditText _runtime;
    @InjectView(R.id.btn_predict) Button _btnpredict;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_yourprediction);
        ButterKnife.inject(this);

        _btnpredict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                predict();
            }
        });

    }

    public void predict() {
        Log.d(TAG, "Predict");


        _btnpredict.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(SettingsActivity.this,
                R.style.Theme_AppCompat_DayNight_DarkActionBar);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Predicting .....");
        progressDialog.show();

        String actor1 = _actor1.getText().toString();
        String actor2 = _actor2.getText().toString();
        String actor3 = _actor3.getText().toString();
        String director = _director.getText().toString();
        String budget = _budget.getText().toString();
        String runtime = _runtime.getText().toString();



    }


}
