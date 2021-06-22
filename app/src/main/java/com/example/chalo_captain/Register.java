package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {

    private Button signin_button;
    private Button register_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        signin_button = (Button)findViewById(R.id.login_page);
        signin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginPage();
            }
        });
        register_button = (Button)findViewById(R.id.register_page);
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCaptainPage();
            }
        });
    }
    public void openLoginPage(){
        Intent intent= new Intent(this, Login.class);
        startActivity(intent);
    }
    public void openCaptainPage(){
        Intent intent= new Intent(this, CaptainProfile.class);
        startActivity(intent);
    }
}