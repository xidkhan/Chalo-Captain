package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.Adaptor.RequestsAdapter;
import com.example.Model.RequestRowModel;

import java.util.ArrayList;
import java.util.List;

public class Requests extends AppCompatActivity {

    RecyclerView recyclerView;
    RequestsAdapter myRequestsAdapter;
    List<RequestRowModel> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requests);

        recyclerView = findViewById(R.id.recyclerView);
        modelList = new ArrayList<>();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        for (int i = 0; i < 10; i++)
        {
            RequestRowModel requestRowModel = new RequestRowModel("abc", "111", R.drawable.logo);
            modelList.add(requestRowModel);
        }
        myRequestsAdapter = new RequestsAdapter(this,modelList);
        recyclerView.setAdapter(myRequestsAdapter);
    }
}




