package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class BeachesCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaches_category);

        // Set a list view for the beach list
        final ArrayList<Site> sites = new ArrayList<Site>();
        // Add items to the list view
        sites.add(new Site("Gordon", R.drawable.gordon_b,
                "This is a beautiful beach, placed at the end og Gordon street.\n " +
                        "You can find there:\n" +
                        "Good restaurants\n" +
                        "Volleyball courts\n" +
                        "City library"));
        sites.add((new Site("Frishman", R.drawable.frishman_b,
                "This is a nice beach especially for families. " +
                        "Take a sit and relax from the rush day.\n")));
        sites.add((new Site("Metzizim", R.drawable.metzizim_b,
                "This is a quite and small beach. It is placed in the " +
                        "northern area of the city. A lot of people come here" +
                        "especially for playing Matkot game. Also" +
                        "this place none as the celebrity beach, " +
                        "so if you will be good you might see one of them ")));
        sites.add((new Site("Jafa", R.drawable.jafa_b,
                "This small beach is located in a beautiful place, at the " +
                        "back you can find to old city of Jafa. " +
                        "So take a short tour in the old city, buy yourself a " +
                        "tasty pastry from Abolafia tabon and go to the beach " +
                        "and enjoy the sunset ")));


        // Log for debug
        //Log.v("BeachesCtegory", sites.get(0).toString());

    }
}
