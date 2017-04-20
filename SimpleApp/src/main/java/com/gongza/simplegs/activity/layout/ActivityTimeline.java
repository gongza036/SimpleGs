package com.gongza.simplegs.activity.layout;

import android.app.Activity;
import android.os.Bundle;

import com.gongza.simplegs.R;

/**
 * Created by gongza on 2017/4/17.
 */

public class ActivityTimeline extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
    }
}
