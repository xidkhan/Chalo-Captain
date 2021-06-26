package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vehicle extends AppCompatActivity {

    private Button updateVehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        updateVehicle = (Button) findViewById(R.id.update_vehicle);
        updateVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCarDetails();
            }
        });
    }

    public void openCarDetails() {
        Intent intent = new Intent(this, Captain_Update.class);
        startActivity(intent);
    }
}