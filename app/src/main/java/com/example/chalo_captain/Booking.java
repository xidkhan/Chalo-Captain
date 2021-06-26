package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Booking extends AppCompatActivity {

    ListView bookingListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        bookingListView = (ListView) findViewById(R.id.bookigList);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("abcd");
        arrayList.add("aaaa");
        arrayList.add("vvvv");
        arrayList.add("ffff");
        arrayList.add("ssss");
        arrayList.add("ggggg");
        arrayList.add("bbbb");
        arrayList.add("kkkk");
        arrayList.add("mmmm");
        arrayList.add("oooo");
        arrayList.add("pppp");
        arrayList.add("kkkk");
        arrayList.add("jjjj");
        arrayList.add("uuuuu");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        bookingListView.setAdapter(arrayAdapter);
    }
}