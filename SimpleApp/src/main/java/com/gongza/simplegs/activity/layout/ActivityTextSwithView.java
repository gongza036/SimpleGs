package com.gongza.simplegs.activity.layout;

import android.app.Activity;
import android.os.Bundle;

import com.gongza.library.views.TextSwitchView;
import com.gongza.simplegs.R;

/**
 * Created by gongza on 2017/4/17.
 */

public class ActivityTextSwithView extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textswithview);
        initView();
    }

    private void initView() {
        TextSwitchView tsv = (TextSwitchView) findViewById(R.id.ts_h);
        String[] res = {
                "静夜思",
                "床前明月光", "疑是地上霜",
                "举头望明月",
                "低头思故乡"
        };
        tsv.setResources(res);
        tsv.setTextStillTime(5000);
    }
}
