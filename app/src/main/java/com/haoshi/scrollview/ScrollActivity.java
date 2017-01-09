package com.haoshi.scrollview;

import android.widget.TextView;

import com.haoshi.R;
import com.haoshi.hao.BaseActivity;
import com.haoshi.hao.IndexActivity;

public class ScrollActivity extends BaseActivity {

    @Override
    public void initView() {
        final TextView textPlace = (TextView) findViewById(R.id.text_place);
        final TextView textTitle = (TextView) findViewById(R.id.text_title);
        StickyScrollView scrollView = (StickyScrollView) findViewById(R.id.activity_scroll);
        scrollView.setOnScrollListener(new StickyScrollView.OnScrollListener() {
            @Override
            public void onScroll(int scrollY) {
                int top = Math.max(scrollY, textPlace.getTop());
                textTitle.layout(0, top, textTitle.getWidth(), top + textTitle.getHeight());
            }
        });
    }
    
    @Override
    public void setData() {
        
    }

    @Override
    public int setContentViewID() {
        return R.layout.activity_scroll;
    }

    @Override
    public String setTitle() {
        return TAG = IndexActivity.class.getSimpleName();
    }
}