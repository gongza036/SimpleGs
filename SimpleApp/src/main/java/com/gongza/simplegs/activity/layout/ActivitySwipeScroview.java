package com.gongza.simplegs.activity.layout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.gongza.simplegs.R;
import com.gongza.simplegs.activity.adapter.SwipelistAdapter;

import java.util.ArrayList;

/**
 * Created by gongza on 2017/2/13.
 */

public class ActivitySwipeScroview extends Activity {
    private ListView lv_swipe_nest;
    private SwipelistAdapter adapter;
    private ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipescroview);
        initView();
    }

    private void initView() {
        lv_swipe_nest = (ListView) findViewById(R.id.lv_swipe_nest);
        list = new ArrayList<>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        list.add("abc4");
        list.add("abc4");
        list.add("abc4");
        list.add("abc4");
        list.add("abc4");
        list.add("abc4");
        list.add("abc4");
        list.add("abc4");
        list.add("abc4");
        adapter = new SwipelistAdapter(ActivitySwipeScroview.this, list);
        lv_swipe_nest.setAdapter(adapter);
    }

}
