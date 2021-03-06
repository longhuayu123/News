package com.example.administrator.news;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Administrator on 2017/5/22.
 */

public class MyAdapter extends FragmentPagerAdapter {

    public String[] titles = new String[]{"推荐", "新闻", "军事", "体育"};

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return new TwoFragment();
        } else if (position == 2) {
            return new ThreeFragment();
        } else if (position == 3) {
            return new FourFragment();
        }
        return new OneFragment();
    }

    @Override
    public int getCount() {
           return titles.length;
    }

    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
