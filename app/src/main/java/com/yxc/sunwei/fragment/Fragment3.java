package com.yxc.sunwei.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yxc.sunwei.R;
import com.yxc.sunwei.ui.MainActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/6/15.
 */

public class Fragment3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.inflate_guide_3,container,false);
        ButterKnife.bind(this,view);
        return view;
    }
    @OnClick(R.id.fragment_button_3)
    public void skip(View view){
        Intent intent=new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
        getActivity().finish();
    }
}
