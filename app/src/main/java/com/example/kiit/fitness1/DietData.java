package com.example.kiit.fitness1;

import java.util.ArrayList;

/**
 * Created by kiit on 30/6/17.
 */

public class DietData
{
    static int position;

    public static void getposition(int pos)
    {
        position=pos;
    }
    public static ArrayList<information> getdata()
    {
        ArrayList<information> data = new ArrayList<>();
       int images[]={
                R.drawable.veg,
                R.drawable.fruits,
                R.drawable.meats,
                R.drawable.milk,
                R.drawable.nuts,
                R.drawable.seafood,
                R.drawable.oil
    };
        String[] Categories = new String[]{"VEGETABLES", "FRUITS", "MEATS", "MILK PRODUCTS", "NUTS", "SEAFOOD","OIL PRODUCTS"};
        for (int i = 0; i < images.length; i++) {
            information current = new information();
            current.title = Categories[i];
            current.imageId = images[i];
            data.add(current);

        }
        return data;
    }
}
