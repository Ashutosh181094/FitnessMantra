package com.example.kiit.fitness1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    MyCustomAdapter2 adapter;
    RecyclerView recyclerView2;
    int position;
    Toolbar toolbar;
    Position position1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView2= (RecyclerView) findViewById(R.id.recyclerView2);
        Data data=new Data();
        Intent intent=getIntent();
        position=intent.getIntExtra("position",0);
        position1=new Position();
        position1.getposition(position);
        adapter = new MyCustomAdapter2(this, data.getdata(position));
        recyclerView2.setAdapter(adapter);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        toolbar= (Toolbar) findViewById(R.id.nav_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });


        if(position==0)
        {
            getSupportActionBar().setTitle("ABS");
        }
        else
        if(position==1)
        {
            getSupportActionBar().setTitle("BACK");
        }
        else
        if(position==2)
        {
            getSupportActionBar().setTitle("CHEST");
        }
        else
        if(position==3)
        {
            getSupportActionBar().setTitle("FOREARM");
        }
        else
        if(position==4)
        {
            getSupportActionBar().setTitle("LEGS");
        }
        else
        {
            getSupportActionBar().setTitle("SHOULDERS");
        }
    }
}