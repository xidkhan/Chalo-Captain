package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity{

    private Button signup_button;
    private Button login_button;
    private TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signup_button = (Button)findViewById(R.id.signup_page);
        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegistration();
            }
        });

        login_button = (Button)findViewById(R.id.login_Page);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPage();
            }
        });

        password = (TextView)findViewById(R.id.ForgotPassword);
        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openForgotPassword();
            }
        });
    }
    public void openRegistration(){
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
    }
    public void loginPage(){
        Intent intent = new Intent(this, Category.class);
        startActivity(intent);
    }
    public void openForgotPassword(){
        Intent intent = new Intent(this, ForgotPassword.class);
        startActivity(intent);
    }
}