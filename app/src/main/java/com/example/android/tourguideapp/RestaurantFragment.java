package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Declare the view we wnt to show
        View rootView = inflater.inflate(R.layout.sites_list_view,container,false);

        // Declare the data - An array of cities
        ArrayList<Site> restaurants = new ArrayList<Site>();
        restaurants.add(new Site("Toto", R.drawable.r_toto, "description"));
        restaurants.add(new Site("Eat Meat", R.drawable.r_eatmeat, "description"));
        restaurants.add(new Site("Kiki Humos", R.drawable.r_kiki, "description"));
        restaurants.add(new Site("Thai-house", R.drawable.r_thilandi, "description"));
        restaurants.add(new Site("Truck Delux", R.drawable.r_truck, "description"));
        restaurants.add(new Site("The magician", R.drawable.r_kosem, "description"));
        restaurants.add(new Site("Frishman Sabich", R.drawable.r_sabich, "description"));
        restaurants.add(new Site("Dizishake", R.drawable.r_milkshake, "description"));


        // Declare Adapter - we need to declare the upper activity,
        // therefore we use "getActivity()" method instead of "this" as an input.
        SiteAdapter adapterRestaurant = new SiteAdapter(getActivity(),restaurants);

        // Declare list view - fragment does not have findViewById method therefore
        // we use rootView.findViewById() instead.
        ListView restaurantList = (ListView) rootView.findViewById(R.id.list_id);

        // Execute the adapter method from cityList ListView
        restaurantList.setAdapter(adapterRestaurant);
        return rootView;

    }

}
