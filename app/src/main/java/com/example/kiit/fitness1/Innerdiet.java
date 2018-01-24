package com.example.kiit.fitness1;

import android.content.Intent;
import android.os.Build;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Innerdiet extends AppCompatActivity
{

    RecyclerView recyclerView4;
    InnerDietAdapter myDietAdapter;
    Toolbar toolbar;
    int position;
    ImageView imageView;
    ArrayList<information> dataActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_innerdiet);
        Intent intent=getIntent();
        position=intent.getIntExtra("position",0);
        imageView= (ImageView) findViewById(R.id.imageViewAppbar);
        recyclerView4= (RecyclerView) findViewById(R.id.recyclerView4);
        InnerDietData data=new InnerDietData();
        myDietAdapter=new InnerDietAdapter(this,data.getdata(position));
        recyclerView4.setAdapter(myDietAdapter);
        GridLayoutManager mgridlayoutmanager = new GridLayoutManager(this, 2);
        recyclerView4.setLayoutManager(mgridlayoutmanager);
        toolbar= (Toolbar) findViewById(R.id.toolbarAppbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout collapsingToolbarLayout= (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar);
        dataActionBar=DietData.getdata();
        recyclerView4.setNestedScrollingEnabled(false);  //This is done so that items in navigation bar scroll smoothly
        collapsingToolbarLayout.setTitle(dataActionBar.get(position).title);
        imageView.setImageResource(dataActionBar.get(position).imageId);



    }


}
