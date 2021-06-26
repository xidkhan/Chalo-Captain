package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
        Intent intent = new Intent(this, Category.class);
        startActivity(intent);
    }
}