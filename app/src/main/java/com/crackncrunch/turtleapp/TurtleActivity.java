package com.crackncrunch.turtleapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import stanford.androidlib.SimpleActivity;

public class TurtleActivity extends SimpleActivity
        implements View.OnClickListener {

    private Button mLeoBtn;
    private Button mMikeBtn;
    private Button mDonBtn;
    private Button mRaphBtn;

    private ImageView mTurtleImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turtle);

        mLeoBtn = (Button) findViewById(R.id.leo_btn);
        mLeoBtn.setOnClickListener(this);
        mMikeBtn = (Button) findViewById(R.id.mike_btn);
        mMikeBtn.setOnClickListener(this);
        mDonBtn = (Button) findViewById(R.id.don_btn);
        mDonBtn.setOnClickListener(this);
        mRaphBtn = (Button) findViewById(R.id.raph_btn);
        mRaphBtn.setOnClickListener(this);

        mTurtleImg = (ImageView) findViewById(R.id.turtle_img);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.leo_btn:
                mTurtleImg.setImageResource(R.drawable.tmntleo);
                break;
            case R.id.mike_btn:
                mTurtleImg.setImageResource(R.drawable.tmntmike);
                break;
            case R.id.don_btn:
                mTurtleImg.setImageResource(R.drawable.tmntdon);
                break;
            case R.id.raph_btn:
                mTurtleImg.setImageResource(R.drawable.tmntraph);
                break;
        }
    }
}
