package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by moti5321 on 12/09/2017.
 */

public class SiteAdapter extends ArrayAdapter<Site> {

    //Constructor method. Super gives us the data from the upper class.
    public SiteAdapter(Activity context, ArrayList<Site> Sites) {
        super(context, 0, Sites);
    }

    // Declare the way we want to see the item.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            LayoutInflater tempInflater = LayoutInflater.from(getContext());
            listItemView = tempInflater.inflate(R.layout.list_item_view, parent, false);
        }
        // Get the specific position of the list item
        Site currentSite = this.getItem(position);

        // Connect the title TextView
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.item_list_text_title_id);
        titleTextView.setText(currentSite.getSiteTitle());

        // Connect the description TextView
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.item_list_text_description_id);
        descriptionTextView.setText(currentSite.getSiteDescription());

        //Connect the ImageView
        ImageView imageView =(ImageView) listItemView.findViewById(R.id.item_list_image_id);
        imageView.setImageResource(currentSite.getImageResId());
        return listItemView;
    }
}
