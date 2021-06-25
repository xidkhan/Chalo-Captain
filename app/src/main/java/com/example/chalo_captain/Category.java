package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Category extends AppCompatActivity implements View.OnClickListener{

    private CardView offerCard, requestCard, dashboardCard;
    //ImageView back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        offerCard = (CardView)findViewById(R.id.offer);
        requestCard = (CardView)findViewById(R.id.request);
        dashboardCard = (CardView)findViewById(R.id.dashboard);

        offerCard.setOnClickListener((View.OnClickListener)this);
        requestCard.setOnClickListener((View.OnClickListener)this);
        dashboardCard.setOnClickListener((View.OnClickListener)this);
    }
    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.offer:
                intent = new Intent(this, Offer.class);
                startActivity(intent);
                break;
            case R.id.request:
                intent = new Intent(this, Request.class);
                startActivity(intent);
                break;
            case R.id.dashboard:
                intent = new Intent(this, Dashboard.class);
                startActivity(intent);
                break;
        }
    }
}