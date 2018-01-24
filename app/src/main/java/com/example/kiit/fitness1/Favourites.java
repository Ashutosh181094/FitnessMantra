package com.example.kiit.fitness1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class Favourites extends AppCompatActivity {
RecyclerView recyclerView;
    Favourites_Adapter adapter;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);
        toolbar= (Toolbar) findViewById(R.id.nav_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Favourites");
        recyclerView= (RecyclerView) findViewById(R.id.recycler_favourites);
        Favourites_data data=new Favourites_data();
        adapter=new Favourites_Adapter(this,data.getdata());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
