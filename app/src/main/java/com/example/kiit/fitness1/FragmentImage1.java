package com.example.kiit.fitness1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by kiit on 20/6/17.
 */

public class FragmentImage1 extends Fragment
{
    String[] Excercisename= new String[]{"Bent Knee Hip Raise", "Cross Body Crunch", "Crunches", "Decline Crunch", "Leg Raise", "Seated Ab Crunch", "Side Bend", "Side Plank","Back Flyes With Resistance Bands", "Hyperextensions", "Lat Pulldown", "Rear Deltoid Row", "Reverse Grid Bent-Over Rows", "Seated Cable Rows", "T-Bar Row", "V-Bar Pulldown","Barbell Incline Bench Press", "Bench Press", "Butterfly", "Cable CrossOver", "Decline Dumbell Bench Press", "Dumbbell Bench Press", "Dumbell Incline Bench Press", "Dumbbell Pullover", "Incline Dumbbell Flyes", "Smith Machine Bench Press","Alternate Hammer Curl", "Biceps Curl Barbell", "Biceps Curl Dumbell", "Biceps Curl Deadlift", "Concentration Curl", "Overhead Curl", "Rope Hammer Curl","Barbell Lunge", "Barbell Squat", "Butt Lift", "Leg Extension","Leg Press", "Lying Machine Squat", "One Legged Cable Kickback", "Romanian Deadlift", "Seated Calf Raise", "Seated Leg Curl","One Arm Dead Lift","Arnold Dumbbell Press", "Barbell Upright Rows", "Bent Over Low Pulley Side Lateral", "Cable Seated Rear Lateral Raise", "Dumbell Shoulder Press", "Front Cable Raise", "Machine shoulder Press", "Seated Barbell Military Press", "Side Lateral Raise"};
    int images[]={R.drawable.twistinghipraise21,R.drawable.bodyweightcrunc2_1,R.drawable.benchdip_1,R.drawable.inclinebenchsitups1,R.drawable.flatbenchlyinglegraise1,R.drawable.seatedrows1,R.drawable.dumbbellsidebends1,R.drawable.sidebridge1,R.drawable.preachercurls1,R.drawable.backextensions1,R.drawable.latpulldowns1,R.drawable.onearmdumbbellrows1,R.drawable.bentoverrow1,R.drawable.seatedrows1,R.drawable.t_bar_bent_over_row_1,R.drawable.tricepspushdown1,R.drawable.barbenchpressincline_1,R.drawable.benchpresses1,R.drawable.pecdeckflies1,R.drawable.lowpulleycablecrossover1,R.drawable.dumbbelldeclinebenchpress_1,R.drawable.dumbbellpress1,R.drawable.dumbbellpresses1,R.drawable.dumbbellpullovers2,R.drawable.dumbbellflys1,R.drawable.barbellbenchpress1,R.drawable.curls_1,R.drawable.barbellcurls1,R.drawable.dumbbellbicepscurl_hammergripstanding_1,R.drawable.deadlifts1,R.drawable.concentrationcurls1,R.drawable.cablecrossoverflys1,R.drawable.lowpulleycurls1,R.drawable.barbelllunge1,R.drawable.barbellsquatoverhead1,R.drawable.bodyweightpullin_1,R.drawable.legextensions1,R.drawable.angledlegpresses1,R.drawable.hacksquats1,R.drawable.cablebackkicks1,R.drawable.deadlifts1,R.drawable.seatedcalfraises1,R.drawable.seatedlegcurls1,R.drawable.onearmsidedeadlift1,R.drawable.angledlegpresses1,R.drawable.uprightrow1,R.drawable.lowpulleyfrontraises1,R.drawable.lowpulleybentoverlateralraises1,R.drawable.dumbbellshoulderpress1,R.drawable.lowpulleylateralraise1,R.drawable.barbellbenchpress1,R.drawable.seatedfrontpresses1,R.drawable.lowpulleylateralraise1};
    String Title = "";
    ImageView imageView;
    InnerDataActionbarTitle innerDataActionbarTitle;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragmentimage1, container, false);
        imageView = (ImageView) view.findViewById(R.id.image1);

        innerDataActionbarTitle = new InnerDataActionbarTitle();
        Title = innerDataActionbarTitle.getActionBarTitle();
        for (int i = 0; i < Excercisename.length; i++)
        {
            if (Title.equals(Excercisename[i]) == true)
            {
                imageView.setImageResource(images[i]);

            }
        }
        return view;

    }
}
