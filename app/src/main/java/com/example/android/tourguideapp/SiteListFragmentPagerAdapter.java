package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by moti5321 on 14/09/2017.
 */

public class SiteListFragmentPagerAdapter extends FragmentPagerAdapter {

    // Constructor method
    public SiteListFragmentPagerAdapter(FragmentManager fm){
        super (fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new BeachesFragment();
            case 1:
                return new RestaurantFragment();
            case 2:
                return new HistoryFragment();
            default:
                return null;
        }

    }

    // Represent how many fragments do we want to show
    @Override
    public int getCount() {
        return 3;
    }
}
