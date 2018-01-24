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

public class Favourites_FragmentImage5 extends Fragment
{
    int position;
    String [] Excercisename=new String[]{"Seated Ab Crunch", "Seated Cable Rows","Biceps Curl Barbell","Biceps Curl Deadlift","Concentration Curl"};
    int images[]={R.drawable.seatedrows5,R.drawable.seatedrows5,R.drawable.barbellcurls5,R.drawable.deadlifts5,R.drawable.concentrationcurls5};
    public void getposition(int position1)
    {
        position=position1;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.favourites_favouriteimage5,container,false);
        ImageView imageView= (ImageView) view.findViewById(R.id.favourites_image5);
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
