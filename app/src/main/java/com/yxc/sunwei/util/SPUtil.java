package com.yxc.sunwei.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.preference.PreferenceManager;

import com.yxc.sunwei.config.Constant;

/**
 * Created by Administrator on 2017/6/15.
 */

public class SPUtil {
    SharedPreferences sp;
    public SPUtil(Context context,String name){
        sp=context.getSharedPreferences(name,Context.MODE_PRIVATE);
    }
    public SPUtil(Context context){
        sp= PreferenceManager.getDefaultSharedPreferences(context);
    }
    public boolean ifFirst(){
        return sp.getBoolean(Constant.FITST,true);
    }
    public void setFitst(boolean flag){
    SharedPreferences.Editor editor=sp.edit();
        editor.putBoolean(Constant.FITST,flag);
        editor.commit();
    }
}
