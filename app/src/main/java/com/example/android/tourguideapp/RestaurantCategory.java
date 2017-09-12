package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_category);


        // Declare the data - An array of cities
        ArrayList<String> cities = new ArrayList<String>();
        cities.add(new String("Tel-Aviv"));
        cities.add(new String("Ranana"));
        cities.add(new String("Ber-Sheva"));
        cities.add(new String("Givat Shmuel"));
        cities.add(new String("Natzrat"));
        cities.add(new String("Tel-Aviv1"));
        cities.add(new String("Tel-Aviv2"));
        cities.add(new String("Tel-Aviv3"));
        cities.add(new String("Tel-Aviv4"));
        cities.add(new String("Tel-Aviv5"));
        cities.add(new String("Tel-Aviv6"));
        cities.add(new String("Tel-Aviv7"));
        cities.add(new String("Tel-Aviv8"));
        cities.add(new String("Tel-Aviv9"));

        // Declare Adpater
        ArrayAdapter<String> adapterCity = new ArrayAdapter<String>(this, R.layout.text_view_example,cities);

        // Declare list view
        ListView cityList = (ListView) findViewById(R.id.restaurant_list_id);
        // Execute the adapter method from cityList ListView
        cityList.setAdapter(adapterCity);

    }
}
