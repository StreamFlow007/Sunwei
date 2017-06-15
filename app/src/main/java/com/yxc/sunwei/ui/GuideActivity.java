package com.yxc.sunwei.ui;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.viewpagerindicator.CirclePageIndicator;
import com.yxc.sunwei.Adapter.MyPagerAdapter;
import com.yxc.sunwei.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GuideActivity extends FragmentActivity {
    MyPagerAdapter adapter;
    @BindView(R.id.fragment_ViewPager)
    ViewPager viewPager;
    @BindView(R.id.indicator)
    CirclePageIndicator indicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);
        initialViewPager();
    }

    private void initialViewPager() {
        adapter=new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);

        final float density=getResources().getDisplayMetrics().density;
        indicator.setBackgroundColor(0xFFCCCCCC);
        indicator.setRadius(10 * density);
        indicator.setPageColor(0x880000FF);
        indicator.setFillColor(0xFF888888);
        indicator.setStrokeColor(0xFF000000);
        indicator.setStrokeWidth(2 * density);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
            if(position==3){
                indicator.setVisibility(View.GONE);
            }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

}
