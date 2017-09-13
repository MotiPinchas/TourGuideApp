package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sites_list_view);


        // Declare the data - An array of cities
        ArrayList<Site> restaurants = new ArrayList<Site>();
        restaurants.add(new Site("Toto", R.drawable.toto, "description"));
        restaurants.add(new Site("Eat Meat", R.drawable.eat_meat, "description"));
        restaurants.add(new Site("Kiki Humos", R.drawable.kiki, "description"));
        restaurants.add(new Site("Thai-house", R.drawable.thilandi, "description"));
        restaurants.add(new Site("Truck Delux", R.drawable.truck, "description"));
        restaurants.add(new Site("The magician", R.drawable.hakosem, "description"));
        restaurants.add(new Site("Frishman Sabich", R.drawable.sabich, "description"));
        restaurants.add(new Site("Dizishake", R.drawable.milkshake, "description"));


        // Declare Adapter
       SiteAdapter adapterRestaurant = new SiteAdapter(this,restaurants);

        // Declare list view
        ListView restaurantList = (ListView) findViewById(R.id.list_id);

        // Execute the adapter method from cityList ListView
        restaurantList.setAdapter(adapterRestaurant);

    }
}
