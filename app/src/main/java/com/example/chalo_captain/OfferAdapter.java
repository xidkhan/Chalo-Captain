package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class OfferAdapter extends AppCompatActivity {

    RecyclerView recyclerView;
    Offers_RecyclerAdaptor offersRecyclerAdaptor;

    String monthNames[] = {"Offer 1","Offer 2","Offer 3","Offer 4","Offer 5","Offer 6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_adapter);

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        offersRecyclerAdaptor = new Offers_RecyclerAdaptor(this, monthNames);
        recyclerView.setAdapter(offersRecyclerAdaptor);
    }
}