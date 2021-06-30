package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Create_Offer extends AppCompatActivity {

    Button createOffer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_offer);

        createOffer = (Button)findViewById(R.id.createOfferButton);
        createOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOffers();
            }
        });
    }

    public void openOffers(){
        Intent intent = new Intent(this, Offers.class);
        startActivity(intent);
    }
}