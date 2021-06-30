package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.Adaptor.OffersAdopter;
import com.example.Model.OfferRowModel;

import java.util.ArrayList;
import java.util.List;

public class Offers extends AppCompatActivity {

    RecyclerView recyclerViewOffer;
    OffersAdopter myRequestsAdapter;
    List<OfferRowModel> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requests);

        recyclerViewOffer = findViewById(R.id.recyclerView);
        modelList = new ArrayList<>();

        recyclerViewOffer.setLayoutManager(new LinearLayoutManager(this));

        for (int i = 0; i < 10; i++)
        {
            OfferRowModel requestRowModel = new OfferRowModel("def", "222", R.drawable.logo);
            modelList.add(requestRowModel);
        }
        myRequestsAdapter = new OffersAdopter(this, modelList);
        recyclerViewOffer.setAdapter(myRequestsAdapter);
    }
}
