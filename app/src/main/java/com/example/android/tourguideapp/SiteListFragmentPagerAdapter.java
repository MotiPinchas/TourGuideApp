package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by moti5321 on 14/09/2017.
 */

public class SiteListFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    // Constructor method
    public SiteListFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
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

    //
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_beaches);
        } else if (position == 1) {
            return mContext.getString(R.string.category_restaurants);
        } else {
            return mContext.getString(R.string.category_history);
        }
    }
}
