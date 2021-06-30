package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class OfferDetails extends AppCompatActivity {

    Button editOffer;
    Button deleteOffer;

    TextView name;
    TextView message;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_details);

        editOffer = (Button)findViewById(R.id.editOffer);
        editOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreateOffer();
            }
        });

        deleteOffer = findViewById(R.id.deleteOffer);
        deleteOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOffers();
            }
        });

        name = (TextView) findViewById(R.id.getName);
        message = (TextView)findViewById(R.id.getMessage);
        image = (ImageView)findViewById(R.id.getImage);

        name.setText(getIntent().getStringExtra("name"));
        message.setText(getIntent().getStringExtra("message"));
        image.setImageResource(getIntent().getIntExtra("image",0));
    }

    public void openCreateOffer(){
        Intent intent = new Intent(this, UpdateOffer.class);
        startActivity(intent);
    }

    public void openOffers(){
        Intent intent = new Intent(this, Offers.class);
        startActivity(intent);
    }
}