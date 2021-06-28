package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AdapterExmple extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdaptor recyclerAdaptor;

    String monthNames[] = {"Offer 1","Offer 2","Offer 3","Offer 4","Offer 5","Offer 6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_exmple);

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerAdaptor = new RecyclerAdaptor(this, monthNames);
        recyclerView.setAdapter(recyclerAdaptor);
    }
}