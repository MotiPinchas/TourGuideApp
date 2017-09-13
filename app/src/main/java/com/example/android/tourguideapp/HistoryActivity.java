package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sites_list_view);

        // Declare Array List
        ArrayList<Site> historicalPlaces = new ArrayList<>();
        historicalPlaces.add(new Site("Old Jaffa", R.drawable.jaffa, "description"));
        historicalPlaces.add(new Site("Rabin Square",R.drawable.rabi_square,"description"));
        historicalPlaces.add(new Site("Tel Aviv museum",R.drawable.museum_tel_aviv,"description"));
        historicalPlaces.add(new Site("Dizinguf Square",R.drawable.dizinguf_square,"description"));
        historicalPlaces.add(new Site("Dizinguf center",R.drawable.center,"description"));
        historicalPlaces.add(new Site("Yarkon Park",R.drawable.park,"description"));
        historicalPlaces.add(new Site("Sarona",R.drawable.sarona,"description"));
        historicalPlaces.add(new Site("SeaPort",R.drawable.seaport,"description"));

        //Declare SiteAdapter
        SiteAdapter historyAdapter = new SiteAdapter(this,historicalPlaces);

        //Connect listView to the ID on the layout
        ListView historicalListView = (ListView) findViewById(R.id.list_id);

        // Apply set adapter from the listView
        historicalListView.setAdapter(historyAdapter);

    }
}
