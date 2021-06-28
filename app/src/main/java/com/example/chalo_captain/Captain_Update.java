package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Captain_Update extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button captainButton, vehicleButton;
    private Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captain_update);
        updateButton = (Button)findViewById(R.id.updateCaptain);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin();
            }
        });

        captainButton = findViewById(R.id.imageView3);
        captainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                int selectImageCode = 1;
                startActivityForResult(Intent.createChooser(intent,"Title"),selectImageCode);
            }
        });

        vehicleButton = findViewById(R.id.vehicle_image);
        vehicleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                int selectImageCode = 1;
                startActivityForResult(Intent.createChooser(intent,"Title"),selectImageCode);
            }
        });

        Spinner spinner = findViewById(R.id.vehicleType);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.vehicle_type, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);
    }
    public void openLogin(){
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
            if(parent.getItemAtPosition(i).equals("Choose Type")){

            }else {
                String item = parent.getItemAtPosition(i).toString();
            }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}