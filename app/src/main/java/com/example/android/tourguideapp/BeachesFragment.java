package com.example.android.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
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
public class BeachesFragment extends Fragment {


    public BeachesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Declare rootView
        View rootView = inflater.inflate(R.layout.sites_list_view, container, false);

        // Set a list view for the beach list
        final ArrayList<Site> sites = new ArrayList<Site>();
        // Add items to the list view
        sites.add(new Site("Gordon", R.drawable.b_gordon,
                "This is a beautiful beach, placed at the end og Gordon street.\n " +
                        "You can find there:\n" +
                        "Good restaurants\n" +
                        "Volleyball courts\n" +
                        "City library"));
        sites.add((new Site("Frishman", R.drawable.b_frishman,
                "This is a nice beach especially for families. " +
                        "Take a sit and relax from the rush day.\n")));
        sites.add((new Site("Metzizim", R.drawable.b_metzizim,
                "This is a quite and small beach. It is placed in the " +
                        "northern area of the city. A lot of people come here" +
                        "especially for playing Matkot game. Also" +
                        "this place none as the celebrity beach, " +
                        "so if you will be good you might see one of them ")));
        sites.add((new Site("Jaffa", R.drawable.b_jafa,
                "This small beach is located in a beautiful place, at the " +
                        "back you can find to old city of Jafa. " +
                        "So take a short tour in the old city, buy yourself a " +
                        "tasty pastry from Abolafia tabon and go to the beach " +
                        "and enjoy the sunset ")));
        sites.add((new Site("Jerusalem", R.drawable.b_jerusalem,
                "This small beach is located in a beautiful place, at the " +
                        "back you can find to old city of Jafa. " +
                        "So take a short tour in the old city, buy yourself a " +
                        "tasty pastry from Abolafia tabon and go to the beach " +
                        "and enjoy the sunset ")));
        sites.add((new Site("Quiet beach", R.drawable.b_quite_beach,
                "This small beach is located in a beautiful place, at the " +
                        "back you can find to old city of Jafa. " +
                        "So take a short tour in the old city, buy yourself a " +
                        "tasty pastry from Abolafia tabon and go to the beach " +
                        "and enjoy the sunset ")));
        // Declare Adapter
        SiteAdapter siteItemAdapter = new SiteAdapter(getActivity(), sites);

        // Declare ListView
        ListView itemListView = (ListView) rootView.findViewById(R.id.list_id);

        // Apply method
        itemListView.setAdapter(siteItemAdapter);




        // Create a listItem click option
        itemListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Site site = sites.get(position);
                Log.v("BeachesCategory", site.toString());
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
