package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set beaches category to be clickable
        ConstraintLayout beaches = (ConstraintLayout) findViewById(R.id.beaches_cat_id);
        beaches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openBeachesIntent = new Intent(MainActivity.this, BeachesCategory.class);
                startActivity(openBeachesIntent);
            }
        });

        // Set restaurants category to be clickable
        final ConstraintLayout restaurants = (ConstraintLayout) findViewById(R.id.restaurant_cat_id);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openRestaurantIntent = new Intent(MainActivity.this,RestaurantCategory.class);
                startActivity(openRestaurantIntent);
            }
        });

        // Set history category to be clickable
        final ConstraintLayout history = (ConstraintLayout) findViewById(R.id.history_cat_id);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openHistoryIntent = new Intent(MainActivity.this,HistoryActivity.class);
                startActivity(openHistoryIntent);
            }
        });

    }
}
