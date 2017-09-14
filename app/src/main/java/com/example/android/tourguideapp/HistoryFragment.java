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
public class HistoryFragment extends Fragment {


    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Declare the view we want to show
        View rootView = inflater.inflate(R.layout.sites_list_view,container,false);

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
        SiteAdapter historyAdapter = new SiteAdapter(getActivity(),historicalPlaces);

        //Connect listView to the ID on the layout, We have to do it throw rootView
        //because fragment doesn't have findViewById method.
        ListView historicalListView = (ListView) rootView.findViewById(R.id.list_id);

        // Apply set adapter from the listView
        historicalListView.setAdapter(historyAdapter);

        return rootView ;
    }

}
