package com.gongza.simplegs.activity.layout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.gongza.simplegs.R;
import com.gongza.simplegs.activity.adapter.SwipelistAdapter;

import java.util.ArrayList;

/**
 * Created by gongza on 2017/2/9.
 */

public class ActivitySwipeLayout extends Activity {
    private ListView lv_swipelayout;
    private SwipelistAdapter adapter;
    private ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipelayout);
        initView();
    }

    private void initView() {
        lv_swipelayout = (ListView) findViewById(R.id.lv_swipelayout);
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
        adapter = new SwipelistAdapter(ActivitySwipeLayout.this, list);
        lv_swipelayout.setAdapter(adapter);
    }
}
