package com.example.kiit.fitness1;

import android.support.design.widget.Snackbar;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by kiit on 17/7/17.
 */

public class Favourites_data
{
     int flag=0;
   static ArrayList<information> data=new ArrayList<>();

    public void getItemContentsforFavourites(int images,String titleo)
    {
        information current = new information();
        current.imageId = images;
        current.title = titleo;
        for (int i = 0; i < data.size(); i++)
        {
            if (data.get(i).title == titleo)
                flag = 1;
        }
        if (flag == 0)
        {
            data.add(current);

        }
    }
    public void removeanitemfromfavourites()
    {
        data.remove(data.size()-1);
    }
    public  int returnflag()
    {
        return flag;
    }
    public static ArrayList<information> getdata()
    {
      return data;
    }
}
