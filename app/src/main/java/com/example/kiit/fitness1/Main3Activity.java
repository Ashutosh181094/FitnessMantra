package com.example.kiit.fitness1;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class Main3Activity  extends AppCompatActivity
{
    ViewPager viewPager=null;
    Toolbar toolbar;
    String titleActionBar="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        viewPager= (ViewPager) findViewById(R.id.pager);
        FragmentManager manager=getSupportFragmentManager();
        viewPager.setAdapter(new Myadapter(manager));
        toolbar= (Toolbar) findViewById(R.id.nav_bar);
        setSupportActionBar(toolbar);
        InnerDataActionbarTitle title=new InnerDataActionbarTitle();
        titleActionBar=title.getActionBarTitle();
        getSupportActionBar().setTitle(titleActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(),Main2Activity.class));
            }
        });
        FloatingActionButton floatingActionButton= (FloatingActionButton) findViewById(R.id.floating);
       floatingActionButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v)
           {
           InnerDataActionbarTitle favouritesdata=new InnerDataActionbarTitle();
               int images=favouritesdata.getImage();
               String itemtitle=favouritesdata.getActionBarTitle();
               Favourites_data data=new Favourites_data();
               data.getItemContentsforFavourites(images,itemtitle);
               int flag=data.returnflag();
               if(flag==1)
               {
                   Snackbar.make(v, "Allready Added to Favourites", Snackbar.LENGTH_LONG)
                           .setAction("Action", null).show();
               }
               else {
                   Snackbar snackbar = Snackbar.make(v, "Added To Favourites", Snackbar.LENGTH_LONG);
                   snackbar.setAction("UNDO", new View.OnClickListener() {
                       @Override
                       public void onClick(View v)
                       {
                           Favourites_data data2=new Favourites_data();
                         data2.removeanitemfromfavourites();
                       }
                   });
                   snackbar.show();
               }
           }
       });


    }
}

class Myadapter extends  FragmentStatePagerAdapter
{
    String[] Excercisename1 = new String[]{"Decline Crunch", "Leg Raise", "Seated Ab Crunch", "Side Bend", "Back Flyes With Resistance Bands", "Reverse Grid Bent-Over Rows", "Seated Cable Rows", "Dumbbell Bench Press", "Biceps Curl Barbell", "Biceps Curl Deadlift", "Concentration Curl", "Leg Press", "One Legged Cable Kickback", "Romanian Deadlift", "Arnold Dumbbell Press", "Barbell Upright Rows", "Bent Over Low Pulley Side Lateral", "Front Cable Raise", "Side Lateral Raise"};
    String [] Excercisename2=new String[]{"Seated Ab Crunch", "Seated Cable Rows","Biceps Curl Barbell","Biceps Curl Deadlift","Concentration Curl"};
    int fragmentCount;
    String titleActionBar="";

    public Myadapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        if(position==0)
        {
            fragment=new FragmentImage1();
        }
        if (position==1)
        {
            fragment=new FragmentImage2();
        }
        if(position==2)
        {
            fragment=new FragmentImage3();
        }
        if(position==3)
        {
            fragment=new FragmentImage4();
        }
        if(position==4)
        {
            fragment=new FragmentImage5();
        }
        return  fragment;
    }

    @Override
    public int getCount()
    {
        InnerDataActionbarTitle title=new InnerDataActionbarTitle();
        titleActionBar=title.getActionBarTitle();
        for (int i = 0; i < Excercisename1.length; i++)
        {
            if (titleActionBar.equals(Excercisename1[i]) == true)
            {
                fragmentCount=4;
            }
        }
        for (int i = 0; i < Excercisename2.length; i++)
        {
            if (titleActionBar.equals(Excercisename2[i]) == true)
            {
                fragmentCount=5;
            }
        }
        if(fragmentCount==4)
        {
            return 4;
        }
        else
            if(fragmentCount==5)
            {
                return 5;
            }
            else
            {
                return 3;
            }
    }
}
