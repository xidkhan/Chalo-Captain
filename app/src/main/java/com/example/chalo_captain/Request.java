package com.example.chalo_captain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class Request extends AppCompatActivity {

    ListView listView;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        listView = (ListView) findViewById(R.id.requestList);
        searchView = (SearchView)findViewById(R.id.searchRequest);


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
        listView.setAdapter(arrayAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);
                return false;
            }
        });
    }
}