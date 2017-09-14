package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class RestaurantCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        // Apple the fragment. "replace actually replace the container to new fragment .
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HistoryFragment()).commit();




    }
}
