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

public class FragmentImage2 extends Fragment {
    String[] Excercisename= new String[]{"Bent Knee Hip Raise", "Cross Body Crunch", "Crunches", "Decline Crunch", "Leg Raise", "Seated Ab Crunch", "Side Bend", "Side Plank","Back Flyes With Resistance Bands", "Hyperextensions", "Lat Pulldown", "Rear Deltoid Row", "Reverse Grid Bent-Over Rows", "Seated Cable Rows", "T-Bar Row", "V-Bar Pulldown","Barbell Incline Bench Press", "Bench Press", "Butterfly", "Cable CrossOver", "Decline Dumbell Bench Press", "Dumbbell Bench Press", "Dumbell Incline Bench Press", "Dumbbell Pullover", "Incline Dumbbell Flyes", "Smith Machine Bench Press","Alternate Hammer Curl", "Biceps Curl Barbell", "Biceps Curl Dumbell", "Biceps Curl Deadlift", "Concentration Curl", "Overhead Curl", "Rope Hammer Curl","Barbell Lunge", "Barbell Squat", "Butt Lift", "Leg Extension", "Leg Press", "Lying Machine Squat","One Legged Cable Kickback", "Romanian Deadlift", "Seated Calf Raise", "Seated Leg Curl","One Arm Dead Lift", "Arnold Dumbbell Press", "Barbell Upright Rows", "Bent Over Low Pulley Side Lateral", "Cable Seated Rear Lateral Raise", "Dumbell Shoulder Press", "Front Cable Raise", "Machine shoulder Press", "Seated Barbell Military Press", "Side Lateral Raise"};
    int images[]={R.drawable.twistinghipraise22,R.drawable.bodyweightcrunc2_2,R.drawable.benchdip_2,R.drawable.inclinebenchsitups2,R.drawable.flatbenchlyinglegraise2,R.drawable.seatedrows2,R.drawable.dumbbellsidebends2,R.drawable.sidebridge2,R.drawable.preachercurls2,R.drawable.backextensions2,R.drawable.latpulldowns2,R.drawable.onearmdumbbellrows2,R.drawable.bentoverrow2,R.drawable.seatedrows2,R.drawable.t_bar_bent_over_row_2,R.drawable.tricepspushdown2,R.drawable.barbenchpressincline_2,R.drawable.benchpresses2,R.drawable.pecdeckflies2,R.drawable.lowpulleycablecrossover2,R.drawable.dumbbelldeclinebenchpress_2,R.drawable.dumbbellpress2,R.drawable.dumbbellpresses2,R.drawable.dumbbellpullovers3,R.drawable.dumbbellflys2,R.drawable.barbellbenchpress2,R.drawable.curls_2,R.drawable.barbellcurls2,R.drawable.dumbbellbicepscurl_hammergripstanding_2,R.drawable.deadlifts2,R.drawable.concentrationcurls2,R.drawable.cablecrossoverflys2,R.drawable.lowpulleycurls2,R.drawable.barbelllunge2,R.drawable.barbellsquatoverhead2,R.drawable.bodyweightpullin_2,R.drawable.legextensions2,R.drawable.angledlegpresses2,R.drawable.hacksquats2,R.drawable.cablebackkicks2,R.drawable.deadlifts2,R.drawable.seatedcalfraises2,R.drawable.seatedlegcurls2,R.drawable.onearmsidedeadlift2,R.drawable.arnoldpress2,R.drawable.uprightrow2,R.drawable.lowpulleyfrontraises2,R.drawable.lowpulleybentoverlateralraises2,R.drawable.dumbbellshoulderpress2,R.drawable.lowpulleylateralraise2,R.drawable.barbellbenchpress2,R.drawable.seatedfrontpresses2,R.drawable.lowpulleylateralraise2};
    String Title = "";
    ImageView imageView;
    InnerDataActionbarTitle innerDataActionbarTitle;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentimage2, container, false);
        imageView = (ImageView) view.findViewById(R.id.image2);
        innerDataActionbarTitle = new InnerDataActionbarTitle();
        Title = innerDataActionbarTitle.getActionBarTitle();
        for (int i = 0; i < Excercisename.length; i++) {
            if (Title.equals(Excercisename[i]) == true) {
                imageView.setImageResource(images[i]);

            }
        }
        return view;
    }
}
