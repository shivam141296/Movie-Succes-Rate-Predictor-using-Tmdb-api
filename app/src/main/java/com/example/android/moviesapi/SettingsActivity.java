package com.example.android.moviesapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by user on 28-04-2018.
 */

public class SettingsActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_yourprediction);
       // getFragmentManager().beginTransaction().replace(android.R.id.content,new SettingsFragment()).commit();
    }


   /* public static class SettingsFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
           // addPreferencesFromResource(R.xml.preferences);
        }
    }*/
}
