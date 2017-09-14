package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class BeachesCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // The numbers activity display the activity category layout , and the fragment display the word list.
        setContentView(R.layout.activity_category);

        // Apply the fragment from the relevant activity
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new BeachesFragment()).commit();


    }
}
