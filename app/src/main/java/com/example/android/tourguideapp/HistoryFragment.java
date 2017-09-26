package com.example.android.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends Fragment {


    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Declare the view we want to show
        View rootView = inflater.inflate(R.layout.sites_list_view, container, false);

        // Declare Array List
        final ArrayList<Site> historicalPlaces = new ArrayList<>();
        historicalPlaces.add(new Site("Old Jaffa", R.drawable.h_jaffa, "Description..."));
        historicalPlaces.add(new Site("Rabin Square", R.drawable.h_rabin_square, "Description..."));
        historicalPlaces.add(new Site("Tel Aviv Museum", R.drawable.h_museum, "Description..."));
        historicalPlaces.add(new Site("Dizengoff Square", R.drawable.h_dizingof_square, "Description..."));
        historicalPlaces.add(new Site("Dizengoff Center", R.drawable.h_dizingof_center, "Description..."));
        historicalPlaces.add(new Site("Hayarkon Park", R.drawable.h_park, "Description..."));
        historicalPlaces.add(new Site("Sarona", R.drawable.h_sarona, "Description..."));
        historicalPlaces.add(new Site("Seaport", R.drawable.h_seaport, "Description..."));

        //Declare SiteAdapter
        SiteAdapter historyAdapter = new SiteAdapter(getActivity(), historicalPlaces);

        //Connect listView to the ID on the layout, We have to do it throw rootView
        //because fragment doesn't have findViewById method.
        ListView historicalListView = (ListView) rootView.findViewById(R.id.list_id);

        // Apply set adapter from the listView
        historicalListView.setAdapter(historyAdapter);

        // Click listener
        historicalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Site site = historicalPlaces.get(position);

                // ***** Toast *****
                Toast.makeText(getContext(), site.getSiteTitle(), Toast.LENGTH_SHORT).show();

                // Open an Site activity intent
                Intent siteIntent = new Intent(getActivity(),SiteActivity.class);
                siteIntent.putExtra("SITE_TITLE",site.getSiteTitle());
                siteIntent.putExtra("SITE_IMAGE",site.getImageResId());
                siteIntent.putExtra("SITE_DESCRIPTION",site.getSiteDescription());
                startActivity(siteIntent);
            }
        });

        return rootView;
    }

}
