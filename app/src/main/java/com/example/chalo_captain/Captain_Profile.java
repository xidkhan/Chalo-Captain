package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Captain_Profile extends AppCompatActivity {

    private Button captain_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captain_profile);

        captain_profile = (Button)findViewById(R.id.update_captain_profile);
        captain_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCaptainUpdate();
            }
        });
    }
    public void openCaptainUpdate(){
        Intent intent = new Intent(this, Captain_Update.class);
        startActivity(intent);
    }
}