package com.example.kiit.fitness1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by kiit on 22/7/17.
 */

public class Favourites_FragmentImage4 extends Fragment
{
    int position;
    String[] Excercisename = new String[]{"Decline Crunch", "Leg Raise", "Seated Ab Crunch", "Side Bend", "Back Flyes With Resistance Bands", "Reverse Grid Bent-Over Rows", "Seated Cable Rows", "Dumbbell Bench Press", "Biceps Curl Barbell", "Biceps Curl Deadlift", "Concentration Curl", "Leg Press", "One Legged Cable Kickback", "Romanian Deadlift", "Arnold Dumbbell Press", "Barbell Upright Rows", "Bent Over Low Pulley Side Lateral", "Front Cable Raise", "Side Lateral Raise"};
    int images[] = {R.drawable.inclinebenchsitups4, R.drawable.flatbenchlyinglegraise5, R.drawable.seatedrows4, R.drawable.dumbbellsidebends4, R.drawable.preachercurls4, R.drawable.bentoverrow4, R.drawable.seatedrows4, R.drawable.dumbbellpress4, R.drawable.barbellcurls4, R.drawable.deadlifts4, R.drawable.concentrationcurls4, R.drawable.angledlegpresses4, R.drawable.cablebackkicks4, R.drawable.deadlifts4, R.drawable.arnoldpress4, R.drawable.uprightrow4, R.drawable.lowpulleyfrontraises4, R.drawable.lowpulleylateralraise4, R.drawable.lowpulleylateralraise4};
    public void getposition(int position1)
    {
        position=position1;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.favourites_favouriteimage4,container,false);
        ImageView imageView= (ImageView) view.findViewById(R.id.favourites_image4);
        ArrayList<information> data=Favourites_data.getdata();
        for (int i = 0; i < data.size(); i++)
        {
            if (data.get(position).title.equals(Excercisename[i]) == true)
            {
                imageView.setImageResource(images[i]);
            }
        }
        return view;
    }
}
