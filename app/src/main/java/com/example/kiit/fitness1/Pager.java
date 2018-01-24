package com.example.kiit.fitness1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by kiit on 29/6/17.
 */

class Pager extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public Pager(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                MoreFragment_DIET tab1 = new MoreFragment_DIET();
                return tab1;
            case 1:
                More_Fragment_Workout tab2 = new More_Fragment_Workout();
                return tab2;
            case 2:
                More_Fragment_Excercises tab3 = new More_Fragment_Excercises();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}

