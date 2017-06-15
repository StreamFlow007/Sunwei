package com.yxc.sunwei.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.yxc.sunwei.fragment.Fragment0;
import com.yxc.sunwei.fragment.Fragment1;
import com.yxc.sunwei.fragment.Fragment2;
import com.yxc.sunwei.fragment.Fragment3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/15.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    List<Fragment> fragmentList;
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
        fragmentList=new ArrayList<Fragment>();
        fragmentList.add(new Fragment0());
        fragmentList.add(new Fragment1());
        fragmentList.add(new Fragment2());
        fragmentList.add(new Fragment3());

    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
