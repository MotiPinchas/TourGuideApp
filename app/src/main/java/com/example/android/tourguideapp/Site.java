package com.example.android.tourguideapp;

/**
 * Created by moti5321 on 10/09/2017.
 */

public class Site {

    String mSiteTitle;
    int mImageResourceId;
    String mSiteDescription;


    // Constructor function
    public Site(String siteTitle, int imageResourceId,String siteDescription) {
        mSiteTitle = siteTitle;
        mImageResourceId = imageResourceId;
        mSiteDescription = siteDescription;
    }

    // Method that returns the title
    public String getSiteTitle() {
        return mSiteTitle;
    }

    // Method that returns the image resource id.
    public int getImageResId() {
        return mImageResourceId;
    }

    // Method that returns the title
    public String getSiteDescription() {
        return mSiteDescription;
    }

    @Override
    public String toString() {
        return "Site{" +
                "mSiteTitle='" + mSiteTitle + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mSiteDescription='" + mSiteDescription + '\'' +
                '}';
    }
}
