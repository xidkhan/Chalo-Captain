package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UpdateOffer extends AppCompatActivity {

    Button updateOffer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_offer);

        updateOffer = findViewById(R.id.updateOffer);
        updateOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateOffer();
            }
        });

    }
    public void updateOffer(){
        Intent intent = new Intent(this, Offers.class);
        startActivity(intent);
    }

}