package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StartEndPoints extends AppCompatActivity {

    EditText etSource, etDistination;
    Button btTrack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_end_points);

        etSource = findViewById(R.id.et_source);
        etDistination = findViewById(R.id.et_distination);
        btTrack = (Button) findViewById(R.id.bt_track);

        btTrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sSource = etSource.getText().toString().trim();
                String sDistination = etDistination.getText().toString().trim();

                if (etSource.equals("") && sDistination.equals("")) {
                    Toast.makeText(getApplicationContext()
                            , "Enter both locations", Toast.LENGTH_SHORT).show();
                } else {
                    DisplayTrack(sSource, sDistination);
                }
            }
        });
    }

    private void DisplayTrack(String sSource, String sDistination) {
        try{
            Uri uri = Uri.parse("https://www.google.co.in/maps/dir/" +sSource + "/" + sDistination);
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);

            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }catch (ActivityNotFoundException e){
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }
}