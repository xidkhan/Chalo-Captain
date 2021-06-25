package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity implements View.OnClickListener{
    private CardView D1,D2,D3,D4,D5,D6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        D1 = (CardView)findViewById(R.id.d1);
        D2 = (CardView)findViewById(R.id.d2);
        D3 = (CardView)findViewById(R.id.d3);
        D4 = (CardView)findViewById(R.id.d4);
        D5 = (CardView)findViewById(R.id.d5);
        D6 = (CardView)findViewById(R.id.d6);

        D1.setOnClickListener((View.OnClickListener)this);
        D2.setOnClickListener((View.OnClickListener)this);
        D3.setOnClickListener((View.OnClickListener)this);
        D4.setOnClickListener((View.OnClickListener)this);
        D5.setOnClickListener((View.OnClickListener)this);
        D6.setOnClickListener((View.OnClickListener)this);
    }
    @Override
    public void onClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.d1: intent = new Intent(this,Category.class); startActivity(intent); break;
            case R.id.d2: intent = new Intent(this,Category.class); startActivity(intent); break;
            case R.id.d3: intent = new Intent(this,Category.class); startActivity(intent); break;
            case R.id.d4: intent = new Intent(this,Category.class); startActivity(intent); break;
            case R.id.d5: intent = new Intent(this,Category.class); startActivity(intent); break;
            case R.id.d6: intent = new Intent(this,Category.class); startActivity(intent); break;
        }
    }
}