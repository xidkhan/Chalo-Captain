package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class OfferDetails extends AppCompatActivity {

    TextView name;
    TextView message;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_details);

        name = (TextView) findViewById(R.id.getName);
        message = (TextView)findViewById(R.id.getMessage);
        image = (ImageView)findViewById(R.id.getImage);

        name.setText(getIntent().getStringExtra("name"));
        message.setText(getIntent().getStringExtra("message"));
        image.setImageResource(getIntent().getIntExtra("image",0));
    }
}