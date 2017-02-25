package com.gongza.simplegs.activity.data;

import android.app.Activity;
import android.os.Bundle;

import com.gongza.library.utils.ACache;
import com.gongza.simplegs.R;

/**
 * Acache用法
 */

public class ActivityAcache extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save();
        load();
    }

    //存
    private void save() {
        ACache mCache = ACache.get(this);
        mCache.put("test_key1", "test value");
        mCache.put("test_key2", "test value", 10);//保存10秒，如果超过10秒去获取这个key，将为null
        mCache.put("test_key3", "test value", 2 * ACache.TIME_DAY);//保存两天，如果超过两天去获取这个key，将为null

    }

    //取
    private void load() {
        ACache mCache = ACache.get(this);
        String value = mCache.getAsString("test_key1");
    }
}
