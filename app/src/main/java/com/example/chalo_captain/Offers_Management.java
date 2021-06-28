package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Offers_Management extends AppCompatActivity {

    private CardView createOffer;
    private CardView myOffer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offers_management);

        createOffer = (CardView)findViewById(R.id.createOffer);
        createOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCreateOffer();
            }
        });

        myOffer = (CardView)findViewById(R.id.myOffers);
        myOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyOffers();
            }
        });

    }
    public void openCreateOffer(){
        Intent intent = new Intent(this, CreateOffer.class);
        startActivity(intent);
    }

    //change to MyOffers --- if required

    public void openMyOffers(){
        Intent intent = new Intent(this, MyOffers.class);
        startActivity(intent);
    }
}