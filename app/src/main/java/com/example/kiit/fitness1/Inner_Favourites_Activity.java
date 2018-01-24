package com.example.kiit.fitness1;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;

public class Inner_Favourites_Activity extends AppCompatActivity
{
    ViewPager viewPager;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        viewPager=(ViewPager) findViewById(R.id.pager);
        FragmentManager manager=getSupportFragmentManager();
        viewPager.setAdapter(new Myadapter1(manager)); //Myadapter class is availabe in Main3Activity.java file
        Intent intent=getIntent();
        position=intent.getIntExtra("position",0);
        Toast.makeText(this,""+position,Toast.LENGTH_LONG).show();
        Favourites_FragmentImage1 favourites_fragmentImage1=new Favourites_FragmentImage1();
        favourites_fragmentImage1.getposition(position);
        Favourites_FragmentImage2 favourites_fragmentImage2=new Favourites_FragmentImage2();
        favourites_fragmentImage2.getposition(position);
        Favourites_FragmentImage3 favourites_fragmentImage3=new Favourites_FragmentImage3();
        favourites_fragmentImage3.getposition(position);
        Favourites_FragmentImage4 favourites_fragmentImage4=new Favourites_FragmentImage4();
        favourites_fragmentImage4.getposition(position);
        Favourites_FragmentImage5 favourites_fragmentImage5=new Favourites_FragmentImage5();
        favourites_fragmentImage5.getposition(position);
    }
}
class Myadapter1 extends FragmentStatePagerAdapter
{
    String[] Excercisename1 = new String[]{"Decline Crunch", "Leg Raise", "Seated Ab Crunch", "Side Bend", "Back Flyes With Resistance Bands", "Reverse Grid Bent-Over Rows", "Seated Cable Rows", "Dumbbell Bench Press", "Biceps Curl Barbell", "Biceps Curl Deadlift", "Concentration Curl", "Leg Press", "One Legged Cable Kickback", "Romanian Deadlift", "Arnold Dumbbell Press", "Barbell Upright Rows", "Bent Over Low Pulley Side Lateral", "Front Cable Raise", "Side Lateral Raise"};
    String [] Excercisename2=new String[]{"Seated Ab Crunch", "Seated Cable Rows","Biceps Curl Barbell","Biceps Curl Deadlift","Concentration Curl"};
    int fragmentCount;


    public Myadapter1(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        if(position==0)
        {
            fragment=new Favourites_FragmentImage1();
        }
        if (position==1)
        {
            fragment=new Favourites_FragmentImage2();
        }
        if(position==2)
        {
            fragment=new Favourites_FragmentImage3();
        }
        if(position==3)
        {
            fragment=new Favourites_FragmentImage4();
        }
        if(position==4)
        {
            fragment=new Favourites_FragmentImage5();
        }
        return  fragment;
    }

    @Override
    public int getCount()
    {
        ArrayList<information> data=Favourites_data.getdata();
        for(int j=0;j<data.size();j++)
        {

            for (int i = 0; i < Excercisename1.length; i++)
            {
                if (data.get(j).title.equals(Excercisename1[i]) == true)
                {
                    fragmentCount = 4;
                }
            }
            for (int i = 0; i < Excercisename2.length; i++)
            {
                if (data.get(j).title.equals(Excercisename2[i]) == true)
                {
                    fragmentCount = 5;
                }
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

