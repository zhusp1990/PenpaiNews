package com.wondertek.pengpainews.ui.activity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;

import com.wondertek.pengpainews.R;
import com.wondertek.pengpainews.utils.FontUtil;
import com.wondertek.pengpainews.view.DropdownLayout;
import com.wondertek.pengpainews.view.SlidingMenu;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    private SlidingMenu mMenu;
    private TextView mTv_curEvent,mTv_caijing,mTv_thought,mTv_life,mTv_question,mTv_booked;
    private View mIn_curEvent,mIn_caijing,mIn_thought,mIn_life,mIn_question,mIn_booked;
    private DropdownLayout mDropdownLayout;

    @Override
    protected void initViews() {
        initMenuViews();
        mDropdownLayout = (DropdownLayout) findViewById(R.id.dropdown_layout);
    }

    @Override
    protected int getRootView() {
        return R.layout.activity_main;
    }

    public void toggleMenu(View view)
    {
        mMenu.toggle();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ll_cur_event:
                initMenuState();
                mTv_curEvent.setTextColor(getResources().getColor(R.color.colorAccent));
                mIn_curEvent.setBackgroundColor(getResources().getColor(R.color.colorAccent));

                break;
            case R.id.ll_caijing:
                initMenuState();
                mTv_caijing.setTextColor(getResources().getColor(R.color.colorAccent));
                mIn_caijing.setBackgroundColor(getResources().getColor(R.color.colorAccent));

                break;
            case R.id.ll_thought:
                initMenuState();
                mTv_thought.setTextColor(getResources().getColor(R.color.colorAccent));
                mIn_thought.setBackgroundColor(getResources().getColor(R.color.colorAccent));

                break;
            case R.id.ll_life:
                initMenuState();
                mTv_life.setTextColor(getResources().getColor(R.color.colorAccent));
                mIn_life.setBackgroundColor(getResources().getColor(R.color.colorAccent));

                break;
            case R.id.ll_question:
                initMenuState();
                mTv_question.setTextColor(getResources().getColor(R.color.colorAccent));
                mIn_question.setBackgroundColor(getResources().getColor(R.color.colorAccent));

                break;
            case R.id.ll_booked:
                initMenuState();
                mTv_booked.setTextColor(getResources().getColor(R.color.colorAccent));
                mIn_booked.setBackgroundColor(getResources().getColor(R.color.colorAccent));

                break;
            case R.id.btn_drop_control:
                mDropdownLayout.toggle();
                break;
        }
    }


    private void initMenuViews() {
        mMenu = (SlidingMenu) findViewById(R.id.id_menu);
        LinearLayout mLl_curEvent = (LinearLayout) findViewById(R.id.ll_cur_event);
        mLl_curEvent.setOnClickListener(this);
        LinearLayout mLl_caijing = (LinearLayout) findViewById(R.id.ll_caijing);
        mLl_caijing.setOnClickListener(this);
        LinearLayout mLl_thought = (LinearLayout) findViewById(R.id.ll_thought);
        mLl_thought.setOnClickListener(this);
        LinearLayout mLl_life = (LinearLayout) findViewById(R.id.ll_life);
        mLl_life.setOnClickListener(this);
        LinearLayout mLl_question = (LinearLayout) findViewById(R.id.ll_question);
        mLl_question.setOnClickListener(this);
        LinearLayout mLl_booked = (LinearLayout) findViewById(R.id.ll_booked);
        mLl_booked.setOnClickListener(this);

        mTv_curEvent = (TextView)findViewById(R.id.tv_cur_event);
        mTv_caijing = (TextView)findViewById(R.id.tv_caijing);
        mTv_thought = (TextView)findViewById(R.id.tv_thought);
        mTv_life = (TextView)findViewById(R.id.tv_life);
        mTv_question = (TextView)findViewById(R.id.tv_question);
        mTv_booked = (TextView)findViewById(R.id.tv_booked);

        mIn_curEvent = findViewById(R.id.indicator_cur_event);
        mIn_caijing = findViewById(R.id.indicator_caijing);
        mIn_thought = findViewById(R.id.indicator_thought);
        mIn_life = findViewById(R.id.indicator_life);
        mIn_question = findViewById(R.id.indicator_question);
        mIn_booked = findViewById(R.id.indicator_booked);
        initMenuState();
        mTv_curEvent.setTextColor(getResources().getColor(R.color.colorAccent));
        mIn_curEvent.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }

    private void initMenuState() {
        mTv_curEvent.setTextColor(getResources().getColor(R.color.text_black_color));
        mTv_caijing.setTextColor(getResources().getColor(R.color.text_black_color));
        mTv_thought.setTextColor(getResources().getColor(R.color.text_black_color));
        mTv_life.setTextColor(getResources().getColor(R.color.text_black_color));
        mTv_question.setTextColor(getResources().getColor(R.color.text_black_color));
        mTv_booked.setTextColor(getResources().getColor(R.color.text_black_color));

        mIn_curEvent.setBackgroundColor(Color.TRANSPARENT);
        mIn_caijing.setBackgroundColor(Color.TRANSPARENT);
        mIn_thought.setBackgroundColor(Color.TRANSPARENT);
        mIn_life.setBackgroundColor(Color.TRANSPARENT);
        mIn_question.setBackgroundColor(Color.TRANSPARENT);
        mIn_booked.setBackgroundColor(Color.TRANSPARENT);
    }
}
