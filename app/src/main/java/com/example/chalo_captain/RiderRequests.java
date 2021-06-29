package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.Adaptor.Adapter;
import com.example.Model.RowModel;

import java.util.ArrayList;
import java.util.List;

public class RiderRequests extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter myAdapter;
    List<RowModel> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider_requests);

        recyclerView = findViewById(R.id.recyclerView);
        modelList = new ArrayList<>();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        for (int i = 0; i < 10; i++)
        {
            RowModel rowModel = new RowModel("abc", "111", R.drawable.logo);
            modelList.add(rowModel);
        }
        myAdapter = new Adapter(this,modelList);
        recyclerView.setAdapter(myAdapter);
    }
}




