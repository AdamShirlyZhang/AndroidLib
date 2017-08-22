package com.shirlyadam.animation.wechat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.shirlyadam.animation.R;

public class BottomToTopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_to_top);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.close_exit_anim);
    }
}
