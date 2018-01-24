package com.example.kiit.fitness1;

import android.content.Intent;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by kiit on 17/6/17.
 */

public class Data
{

   static String [] Categories;
   static int images[];

    public  ArrayList<information> getdata(int position)
    {


        if (position == 0)
        {
            ArrayList<information> data1 = new ArrayList<>();
             images=new int[]
                     {
                    R.drawable.icon_bent_knee_hip_raise,
                    R.drawable.icon_cross_body_crunch,
                    R.drawable.icon_crunches,
                    R.drawable.icon_decline_crunch,
                    R.drawable.icon_leg_raise,
                    R.drawable.icon_seated_ab_crunch,
                    R.drawable.icon_side_bend,
                    R.drawable.icon_side_plank,


            };

            Categories = new String[]{"Bent Knee Hip Raise", "Cross Body Crunch", "Crunches", "Decline Crunch", "Leg Raise", "Seated Ab Crunch", "Side Bend", "Side Plank"};
            for (int i = 0; i < images.length; i++) {
                information current = new information();
                current.title = Categories[i];
                current.imageId = images[i];
                data1.add(current);

            }
            return data1;
        } else if (position == 1) {
            ArrayList<information> data2 = new ArrayList<>();

             images=new int[]{
                    R.drawable.icon_back_flys_cable,
                    R.drawable.icon_hyperextensions,
                    R.drawable.icon_lat_pulldown,
                    R.drawable.icon_rear_deltoid_row,
                    R.drawable.icon_reverse_grip_bent_over_rows,
                    R.drawable.icon_seated_cable_rows,
                    R.drawable.icon_t_bar_row,
                    R.drawable.icon_v_bar_pulldown,

            };

            Categories = new String[]{"Back Flyes With Resistance Bands", "Hyperextensions", "Lat Pulldown", "Rear Deltoid Row", "Reverse Grid Bent-Over Rows", "Seated Cable Rows", "T-Bar Row", "V-Bar Pulldown"};

            for (int i = 0; i < images.length; i++) {
                information current = new information();
                current.title = Categories[i];
                current.imageId = images[i];
                data2.add(current);
            }
            return data2;
        } else if (position == 2) {
            ArrayList<information> data3 = new ArrayList<>();
            images = new int[]{
                    R.drawable.icon_barbell_incline_bench_press,
                    R.drawable.icon_bench_press,
                    R.drawable.icon_butterfly,
                    R.drawable.icon_cable_crossover,
                    R.drawable.icon_decline_dumbbell_bench_press,
                    R.drawable.icon_dumbbell_bench_press,
                    R.drawable.icon_dumbbell_incline_bench_press,
                    R.drawable.icon_dumbbell_pullover,
                    R.drawable.icon_incline_dumbbell_flyes,
                    R.drawable.icon_smith_machine_bench_press

            };
            Categories = new String[]{"Barbell Incline Bench Press", "Bench Press", "Butterfly", "Cable CrossOver", "Decline Dumbell Bench Press", "Dumbbell Bench Press", "Dumbell Incline Bench Press", "Dumbbell Pullover", "Incline Dumbbell Flyes", "Smith Machine Bench Press"};

            for (int i = 0; i < images.length; i++) {
                information current = new information();
                current.title = Categories[i];
                current.imageId = images[i];
                data3.add(current);

            }
            return data3;
        } else if (position == 3) {
            ArrayList<information> data4 = new ArrayList<>();
            images = new int[]{
                    R.drawable.icon_alternate_hammer_curl,
                    R.drawable.icon_biceps_curl_barbell,
                    R.drawable.icon_biceps_curl,
                    R.drawable.icon_biceps_curl_with_deadlift,
                    R.drawable.icon_concentration_curl,
                    R.drawable.icon_overhead_curl,
                    R.drawable.icon_rope_hammer_curl,


            };
            Categories = new String[]{"Alternate Hammer Curl", "Biceps Curl Barbell", "Biceps Curl Dumbell", "Biceps Curl Deadlift", "Concentration Curl", "Overhead Curl", "Rope Hammer Curl"};

            for (int i = 0; i < images.length; i++) {
                information current = new information();
                current.title = Categories[i];
                current.imageId = images[i];
                data4.add(current);

            }
            return data4;
        } else if (position == 4) {
            ArrayList<information> data5 = new ArrayList<>();
            images =new int[] {
                    R.drawable.icon_barbell_lunge,
                    R.drawable.icon_barbell_squat,
                    R.drawable.icon_butt_lift,
                    R.drawable.icon_leg_extensions,
                    R.drawable.icon_leg_press,
                    R.drawable.icon_lying_machine_squat,
                    R.drawable.icon_one_legged_cable_kickback,
                    R.drawable.icon_romanian_deadlift,
                    R.drawable.icon_seated_calf_raise,
                    R.drawable.icon_seated_leg_curl,
                    R.drawable.icon_one_arm_side_deadlift


            };
            Categories = new String[]{"Barbell Lunge", "Barbell Squat", "Butt Lift", "Leg Extension", "Leg Press","Lying Machine Squat", "One Legged Cable Kickback", "Romanian Deadlift", "Seated Calf Raise", "Seated Leg Curl","One Arm Dead Lift"};

            for (int i = 0; i < images.length; i++) {
                information current = new information();
                current.title = Categories[i];
                current.imageId = images[i];
                data5.add(current);

            }
            return data5;
        } else

        {
            ArrayList<information> data6 = new ArrayList<>();
            images =new int[] {
                    R.drawable.icon_arnold_dumbbell_press,
                    R.drawable.icon_barbell_upright_rows,
                    R.drawable.icon_bent_over_low_pulley_side_lateral,
                    R.drawable.icon_cable_seated_rear_lateral_raise,
                    R.drawable.icon_dumbbell_shoulder_press,
                    R.drawable.icon_front_cable_raise,
                    R.drawable.icon_smith_machine_shoulder_press,
                    R.drawable.icon_seated_barbell_military_press,
                    R.drawable.icon_cable_side_lateral_raise

            };
            Categories = new String[]{"Arnold Dumbbell Press", "Barbell Upright Rows", "Bent Over Low Pulley Side Lateral", "Cable Seated Rear Lateral Raise", "Dumbell Shoulder Press", "Front Cable Raise", "Machine shoulder Press", "Seated Barbell Military Press", "Side Lateral Raise"};
            for (int i = 0; i < images.length; i++) {
                information current = new information();
                current.title = Categories[i];
                current.imageId = images[i];
                data6.add(current);

            }
            return data6;
        }
    }
        public static String[] send()
        {
            return Categories;
        }
        public void  sendimages()
        {
            InnerDataActionbarTitle innerDataActionbarTitle=new InnerDataActionbarTitle();
            innerDataActionbarTitle.getImages(images);
        }

    }


