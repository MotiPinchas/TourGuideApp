package com.example.android.tourguideapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class SiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hide action bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_site);

        // Set TextView title
        TextView titleTextView = (TextView) findViewById(R.id.site_title_id);
        titleTextView.setText(getIntent().getStringExtra("SITE_TITLE"));
        Typeface twoDTypeFace = Typeface.createFromAsset(getAssets(),"2Dumb.ttf");
        titleTextView.setTypeface(twoDTypeFace);

        // Set ImageView resource
        ImageView siteImageView = (ImageView) findViewById(R.id.title_image_view);
        siteImageView.setImageResource(getIntent().getIntExtra("SITE_IMAGE",0));

        // Set TextView description
        TextView descriptionTextView = (TextView) findViewById(R.id.text_description_id);
        descriptionTextView.setText(getIntent().getStringExtra("SITE_DESCRIPTION"));
    }
}
