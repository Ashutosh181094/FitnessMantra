package com.example.kiit.fitness1;

import java.util.ArrayList;

/**
 * Created by kiit on 18/6/17.
 */

public class Maindata {
    static int position;
    public static void getposition(int pos)
    {
        position=pos;
    }
    public static ArrayList<information> getdata()
    {
        ArrayList<information> data = new ArrayList<>();
        int images[] = {
                R.drawable.cat1,
                R.drawable.cat2,
                R.drawable.cat3,
                R.drawable.cat4,
                R.drawable.cat5,
                R.drawable.cat6,

        };
        String[] Categories = {"ABS", "BACK", "CHEST", "FOREARMS", "LEGS", "SHOULDERS",};
        for (int i = 0; i < images.length; i++) {
            information current = new information();
            current.title = Categories[i];
            current.imageId = images[i];
            data.add(current);

        }
        return data;
    }
}
