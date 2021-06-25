package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity implements View.OnClickListener{
    private CardView profileCard, bookingCard, vehicleCard, paymentCard, homeCard, ratingCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        profileCard = (CardView)findViewById(R.id.profile);
        bookingCard = (CardView)findViewById(R.id.bookings);
        vehicleCard = (CardView)findViewById(R.id.vehicle);
        paymentCard = (CardView)findViewById(R.id.payments);
        homeCard = (CardView)findViewById(R.id.home);
        ratingCard = (CardView)findViewById(R.id.ratings);

        profileCard.setOnClickListener((View.OnClickListener)this);
        bookingCard.setOnClickListener((View.OnClickListener)this);
        vehicleCard.setOnClickListener((View.OnClickListener)this);
        paymentCard.setOnClickListener((View.OnClickListener)this);
        homeCard.setOnClickListener((View.OnClickListener)this);
        ratingCard.setOnClickListener((View.OnClickListener)this);
    }
    @Override
    public void onClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.profile: intent = new Intent(this,Captain_Profile.class); startActivity(intent); break;
            case R.id.bookings: intent = new Intent(this,Booking.class); startActivity(intent); break;
            case R.id.vehicle: intent = new Intent(this,Vehicle.class); startActivity(intent); break;
            case R.id.payments: intent = new Intent(this,Payment.class); startActivity(intent); break;
            case R.id.home: intent = new Intent(this,Category.class); startActivity(intent); break;
            case R.id.ratings: intent = new Intent(this, Rating.class); startActivity(intent); break;
        }
    }
}