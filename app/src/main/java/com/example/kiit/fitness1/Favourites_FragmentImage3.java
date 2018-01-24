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

public class Favourites_FragmentImage3 extends Fragment
{
    int position;
    String[] Excercisename= new String[]{"Bent Knee Hip Raise", "Cross Body Crunch", "Crunches", "Decline Crunch", "Leg Raise", "Seated Ab Crunch", "Side Bend", "Side Plank","Back Flyes With Resistance Bands", "Hyperextensions", "Lat Pulldown", "Rear Deltoid Row", "Reverse Grid Bent-Over Rows", "Seated Cable Rows", "T-Bar Row", "V-Bar Pulldown","Barbell Incline Bench Press", "Bench Press", "Butterfly", "Cable CrossOver", "Decline Dumbell Bench Press", "Dumbbell Bench Press", "Dumbell Incline Bench Press", "Dumbbell Pullover", "Incline Dumbbell Flyes", "Smith Machine Bench Press","Alternate Hammer Curl", "Biceps Curl Barbell", "Biceps Curl Dumbell", "Biceps Curl Deadlift", "Concentration Curl", "Overhead Curl", "Rope Hammer Curl","Barbell Lunge", "Barbell Squat", "Butt Lift", "Leg Extension", "Leg Press","Lying Machine Squat", "One Legged Cable Kickback", "Romanian Deadlift", "Seated Calf Raise", "Seated Leg Curl", "One Arm Dead Lift", "Arnold Dumbbell Press", "Barbell Upright Rows", "Bent Over Low Pulley Side Lateral", "Cable Seated Rear Lateral Raise", "Dumbell Shoulder Press", "Front Cable Raise", "Machine shoulder Press", "Seated Barbell Military Press", "Side Lateral Raise"};
    int images[]={R.drawable.twistinghipraise23,R.drawable.bodyweightcrunc2_3,R.drawable.benchdip_3,R.drawable.inclinebenchsitups3,R.drawable.flatbenchlyinglegraise3,R.drawable.seatedrows3,R.drawable.dumbbellsidebends3,R.drawable.sidebridge3,R.drawable.preachercurls3,R.drawable.backextensions3,R.drawable.latpulldowns3,R.drawable.onearmdumbbellrows3,R.drawable.bentoverrow3,R.drawable.seatedrows3,R.drawable.t_bar_bent_over_row_3,R.drawable.tricepspushdown3,R.drawable.barbenchpressincline_3,R.drawable.benchpresses3,R.drawable.pecdeckflies3,R.drawable.lowpulleycablecrossover3,R.drawable.dumbbelldeclinebenchpress_3,R.drawable.dumbbellpress3,R.drawable.dumbbellpresses3,R.drawable.dumbbellpullovers4,R.drawable.dumbbellflys3,R.drawable.barbellbenchpress3,R.drawable.curls_3,R.drawable.barbellcurls3,R.drawable.dumbbellbicepscurl_hammergripstanding_3,R.drawable.deadlifts3,R.drawable.concentrationcurls3,R.drawable.cablecrossoverflys3,R.drawable.lowpulleycurls3,R.drawable.barbelllunge3,R.drawable.barbellsquatoverhead3,R.drawable.bodyweightpullin_3,R.drawable.legextensions3,R.drawable.angledlegpresses3,R.drawable.hacksquats3,R.drawable.cablebackkicks3,R.drawable.deadlifts3,R.drawable.seatedcalfraises3,R.drawable.seatedlegcurls3,R.drawable.onearmsidedeadlift3,R.drawable.arnoldpress3,R.drawable.uprightrow3,R.drawable.lowpulleyfrontraises3,R.drawable.lowpulleybentoverlateralraises3,R.drawable.dumbbellshoulderpress3,R.drawable.lowpulleylateralraise3,R.drawable.barbellbenchpress3,R.drawable.seatedfrontpresses3,R.drawable.lowpulleylateralraise3};
    public void getposition(int position1)
    {
        position=position1;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.favourites_favouriteimage3,container,false);
        ImageView imageView= (ImageView) view.findViewById(R.id.favourites_image3);
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
