package com.example.kiit.fitness1;

import android.util.Log;
import android.widget.Toast;

/**
 * Created by kiit on 22/6/17.
 */

public class InnerDataActionbarTitle {
     static String posTitle="";
    static int positionInnerListiew=0;
    static int i;
    static int image;
    public static void  positionle(int positionofInnerListview)
    {
        i=0;
        positionInnerListiew=positionofInnerListview;
    }
    public void ActionBarTitle(String ActionBarTitleName[])
    {

        posTitle=ActionBarTitleName[positionInnerListiew];
    }
    public void getImages(int images[])
    {
         image=images[positionInnerListiew];
    }

    public static String getActionBarTitle()
    {
        return posTitle;
    }
    public static int getImage()
    {
        return image;
    }


}
