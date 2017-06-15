package com.yxc.sunwei.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yxc.sunwei.R;
import com.yxc.sunwei.util.SPUtil;

public class SplashActivity extends Activity {
    SPUtil spUtil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        spUtil=new SPUtil(this);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent;
                if(spUtil.ifFirst()){
                    intent=new Intent(SplashActivity.this,GuideActivity.class);
                   spUtil.setFitst(false);
                }else {
                    intent=new Intent(SplashActivity.this,MainActivity.class);
                }
                startActivity(intent);
                finish();
            }
        },1500);

    }

}
