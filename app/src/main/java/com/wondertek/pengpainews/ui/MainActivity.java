package com.wondertek.pengpainews.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.wondertek.pengpainews.R;
import com.wondertek.pengpainews.view.SlidingMenu;

public class MainActivity extends AppCompatActivity {

    private SlidingMenu mMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        mMenu = (SlidingMenu) findViewById(R.id.id_menu);

    }

    public void toggleMenu(View view)
    {
        mMenu.toggle();
    }
}
