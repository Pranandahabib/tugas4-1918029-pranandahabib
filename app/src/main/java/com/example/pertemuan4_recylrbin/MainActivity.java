package com.example.pertemuan4_recylrbin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private itemAdapter adapter;
    private ArrayList<item> itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        adapter = new itemAdapter(itemArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        itemArrayList = new ArrayList<>();
        itemArrayList.add(new item("BARCELONA", "LAPORTA", "ESPANA",R.drawable.barcalona));
        itemArrayList.add(new item("JUVENTUS", "AGNELLI", "ITALIA",R.drawable.jupentus));
        itemArrayList.add(new item("LIVERPOOL", "JHON.W.HERRY", "INGGRIS",R.drawable.liverpoll));
        itemArrayList.add(new item("REAL MADRID", "PEREZZ", "ESPANA",R.drawable.madrid));
        itemArrayList.add(new item("PSG", "NASSERR", "PARIS",R.drawable.psg));
        itemArrayList.add(new item("MANCHESTER CITY", "SHEIKH MANSOUR ", "INGGRIS",R.drawable.city));
        itemArrayList.add(new item("MANCHESTER UNITED", "KATAK BIZZER ", "INGGRIS",R.drawable.mu));
    }
}