package com.example.kiit.fitness1;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by kiit on 22/6/17.
 */

public class Position
{

    static int pos;
    public void getposition(int position)
    {
        pos=position;
    }
    public static  int giveposition()
    {
        return pos;
    }
}
