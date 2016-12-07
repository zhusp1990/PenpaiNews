package com.wondertek.pengpainews.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.wondertek.pengpainews.utils.FontUtil;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View rootView = LayoutInflater.from(this).inflate(getRootView(),null);
        if (null != rootView){
            setContentView(rootView);
            FontUtil.injectFont(findViewById(android.R.id.content));
            initViews();
        }
    }

    protected abstract void initViews();

    protected abstract int getRootView();
}
