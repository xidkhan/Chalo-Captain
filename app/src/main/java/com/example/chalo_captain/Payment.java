package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Payment extends AppCompatActivity {
    ListView paymentlistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        paymentlistView = (ListView) findViewById(R.id.paymentList);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Payment 1");
        arrayList.add("Payment 2");
        arrayList.add("Payment 3");
        arrayList.add("Payment 4");
        arrayList.add("Payment 5");
        arrayList.add("Payment 6");
        arrayList.add("Payment 7");
        arrayList.add("Payment 8");
        arrayList.add("Payment 9");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        paymentlistView.setAdapter(arrayAdapter);
    }
}