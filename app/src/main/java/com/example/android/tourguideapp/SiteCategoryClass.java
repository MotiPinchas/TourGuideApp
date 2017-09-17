package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class SiteCategoryClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // The numbers activity display the activity category layout , and the fragment display the word list.
        setContentView(R.layout.activity_category);

        // Create a ViewPager to enable swipe between pages
        ViewPager siteListViewPager = (ViewPager) findViewById(R.id.view_pager_id);

        // Create viewPagerAdapter
        SiteListFragmentPagerAdapter adapter =new SiteListFragmentPagerAdapter(getSupportFragmentManager());

        // Apply the adapter
        siteListViewPager.setAdapter(adapter);


//        // Apply the chosen fragment from the relevant activity
//        getSupportFragmentManager().beginTransaction().replace(R.id.container,new BeachesFragment()).commit();


    }
}
