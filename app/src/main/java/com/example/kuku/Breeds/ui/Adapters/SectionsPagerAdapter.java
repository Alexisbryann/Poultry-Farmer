package com.example.kuku.Breeds.ui.Adapters;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
       Fragment fragment = null;

       switch (position){
           case 0:
               fragment = new FragmentBroilers();
               break;
           case 1:
               fragment = new FragmentBroilers();
               break;
           case 2:
               fragment = new FragmentBroilers();
               break;
           case 3:
               fragment = new FragmentBroilers();
               break;
           case 4:
               fragment = new FragmentBroilers();
               break;
       }

        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        switch (position){
            case 0:
                title = "Broiler";
                break;
            case 1:
                title = "Dual purpose";
                break;
            case 2:
                title = "Improved indigenous chicken";
                break;
            case 3:
                title = "Indigenous (local)";
                break;
            case 4:
                title = "Layer";
                break;
        }
        return title;
    }

    @Override
    public int getCount() {
        return 5;
    }
}