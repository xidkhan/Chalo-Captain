package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.Adaptor.OffersAdaptor;

public class CreateOffer extends AppCompatActivity {

    private Button createOffer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_offer);

        createOffer = (Button)findViewById(R.id.createOfferButton);
        createOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCategory();
            }
        });
    }

    public void openCategory(){
        Intent intent = new Intent(this, OfferAdapter.class);
        startActivity(intent);
    }

    public static class OfferAdapter extends AppCompatActivity {

        RecyclerView recyclerView;
        OffersAdaptor offersRecyclerAdaptor;

        String monthNames[] = {"Offer 1","Offer 2","Offer 3","Offer 4","Offer 5","Offer 6"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_offer_adapter);

            recyclerView = findViewById(R.id.recycleView);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            offersRecyclerAdaptor = new OffersAdaptor(this, monthNames);
            recyclerView.setAdapter(offersRecyclerAdaptor);
        }
    }
}