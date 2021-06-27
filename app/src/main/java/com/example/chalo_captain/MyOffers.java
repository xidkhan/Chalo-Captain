package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MyOffers extends AppCompatActivity {

    ListView myOfferView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_offers);

        myOfferView = (ListView) findViewById(R.id.myOffersList);


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Offer 1");
        arrayList.add("Offer 2");
        arrayList.add("Offer 3");
        arrayList.add("Offer 4");
        arrayList.add("Offer 5");
        arrayList.add("Offer 6");
        arrayList.add("Offer 7");
        arrayList.add("Offer 8");
        arrayList.add("Offer 9");
        arrayList.add("Offer 10");
        arrayList.add("Offer 11");
        arrayList.add("Offer 12");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        myOfferView.setAdapter(arrayAdapter);

    }

}