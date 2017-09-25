package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class SiteCategoryClass extends AppCompatActivity {

    public int firstActivity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // The numbers activity display the activity category layout , and the fragment display the word list.
        setContentView(R.layout.activity_category);

        // Create a ViewPager to enable swipe between pages
        ViewPager siteListViewPager = (ViewPager) findViewById(R.id.view_pager_id);

        // Create viewPagerAdapter
        SiteListFragmentPagerAdapter adapter = new SiteListFragmentPagerAdapter(this, getSupportFragmentManager());

        // Apply the adapter
        siteListViewPager.setAdapter(adapter);

        // Apply the right item to show
        // First we get the number from the main activity
        // and then we apply the siteListViewPager.setCurrentItem();
        firstActivity = getIntent().getIntExtra("CURRENT_CATEGORY", 0);
        siteListViewPager.setCurrentItem(firstActivity);

        // Tab viewer
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tab_id);

        // This method connect the view pager to the tab such that when the viewPager get changed the TabLayout get
        // changed also.
        tabLayout.setupWithViewPager(siteListViewPager);


    }
}
