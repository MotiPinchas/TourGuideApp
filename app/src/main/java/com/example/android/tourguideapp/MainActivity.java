package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set beaches category to be clickable
        TextView beaches = (TextView) findViewById(R.id.beaches_cat_id);
        beaches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openBeachesIntent = new Intent(MainActivity.this, BeachesCategory.class);
                startActivity(openBeachesIntent);
            }
        });

        // Set restaurants category to be clickable
        final TextView restaurants = (TextView) findViewById(R.id.restaurant_cat_id);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openRestaurantIntent = new Intent(MainActivity.this,RestaurantCategory.class);
                startActivity(openRestaurantIntent);
            }
        });

        // Set history category to be clickable
        final TextView history = (TextView) findViewById(R.id.history_cat_id);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openHistoryIntent = new Intent(MainActivity.this,HistoryActivity.class);
                startActivity(openHistoryIntent);
            }
        });

        // Set entertainment category to be clickable
        final TextView entertainment = (TextView) findViewById(R.id.entertainment_cat_id);
        entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openEntertainmentIntent = new Intent(MainActivity.this,EntertainmentActivity.class);
                startActivity(openEntertainmentIntent);
            }
        });
    }
}
