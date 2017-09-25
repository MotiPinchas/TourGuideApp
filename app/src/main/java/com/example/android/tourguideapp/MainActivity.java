package com.example.android.tourguideapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


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
                Intent openSiteCategoryIntent = new Intent(MainActivity.this, SiteCategoryClass.class);
                // Pass the current list to the next activity.
                openSiteCategoryIntent.putExtra("CURRENT_CATEGORY",0);
                startActivity(openSiteCategoryIntent);
            }
        });

        // Set restaurants category to be clickable
        final ConstraintLayout restaurants = (ConstraintLayout) findViewById(R.id.restaurant_cat_id);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openSiteCategoryIntent = new Intent(MainActivity.this, SiteCategoryClass.class);
                // Pass the current list to the next activity.
                openSiteCategoryIntent.putExtra("CURRENT_CATEGORY", 1);
                startActivity(openSiteCategoryIntent);
            }
        });

        // Set history category to be clickable
        final ConstraintLayout history = (ConstraintLayout) findViewById(R.id.history_cat_id);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openSiteCategoryIntent = new Intent(MainActivity.this, SiteCategoryClass.class);
                // Pass the current list to the next activity.
                openSiteCategoryIntent.putExtra("CURRENT_CATEGORY",2);
                startActivity(openSiteCategoryIntent);
            }
        });


        // ***** FONT DECELERATION *****
        Typeface threeDTypeFace = Typeface.createFromAsset(getAssets(), "3Dumb.ttf");

        // Connect the text view to the layout
        TextView beachTextView = (TextView) findViewById(R.id.beach_text_view_main);
        TextView restaurantTextView = (TextView) findViewById(R.id.restaurant_text_view_main);
        TextView historyTextView = (TextView) findViewById(R.id.history_text_view_main);

        // change the font
        beachTextView.setTypeface(threeDTypeFace);
        restaurantTextView.setTypeface(threeDTypeFace);
        historyTextView.setTypeface(threeDTypeFace);
    }

}
