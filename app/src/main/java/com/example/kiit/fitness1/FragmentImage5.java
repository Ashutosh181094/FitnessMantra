package com.example.kiit.fitness1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.zip.Inflater;

/**
 * Created by kiit on 24/6/17.
 */

public class FragmentImage5 extends Fragment {
    String [] Excercisename=new String[]{"Seated Ab Crunch", "Seated Cable Rows","Biceps Curl Barbell","Biceps Curl Deadlift","Concentration Curl"};
    int images[]={R.drawable.seatedrows5,R.drawable.seatedrows5,R.drawable.barbellcurls5,R.drawable.deadlifts5,R.drawable.concentrationcurls5};
    String Title="";
    ImageView imageView;
    InnerDataActionbarTitle innerDataActionbarTitle;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentimage5, container, false);
        imageView= (ImageView) view.findViewById(R.id.image5);
        innerDataActionbarTitle=new InnerDataActionbarTitle();
        Title=innerDataActionbarTitle.getActionBarTitle();
        for(int i=0;i<Excercisename.length;i++)
        {
            if(Title.equals(Excercisename[i])==true)
            {
                imageView.setImageResource(images[i]);
            }
        }
        return view;


    }
}
