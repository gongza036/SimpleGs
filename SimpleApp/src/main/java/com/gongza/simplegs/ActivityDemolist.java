package com.gongza.simplegs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.gongza.simplegs.activity.adapter.DemolistAdapter;
import com.gongza.simplegs.activity.data.ActivityRetrofit;
import com.gongza.simplegs.activity.data.ActivityRxAndroid;
import com.gongza.simplegs.activity.layout.ActivitySwipeLayout;
import com.gongza.simplegs.activity.layout.ActivityTimeline;

import java.util.ArrayList;

/**
 * Created by gongza on 2017/2/13.
 */

public class ActivityDemolist extends Activity {
    private ListView lv_swipe_nest;
    private ArrayList<DemoBean> list;
    private DemolistAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demolist);
        initData();
        initView();
    }

    private void initView() {
        ListView lv_demo= (ListView) findViewById(R.id.lv_demo);
        lv_demo.setAdapter(adapter);
    }

    private void initData(){
        list=new ArrayList<>();
        DemoBean demoSwipeLayout=new DemoBean();
        demoSwipeLayout.setDemoName("SwipeLayout左滑");
        demoSwipeLayout.setDemoClazz(ActivitySwipeLayout.class);
        list.add(demoSwipeLayout);
        DemoBean timelineLayout=new DemoBean();
        timelineLayout.setDemoName("时间线");
        timelineLayout.setDemoClazz(ActivityTimeline.class);
        list.add(timelineLayout);
        DemoBean rx=new DemoBean();
        rx.setDemoName("RxAndroid");
        rx.setDemoClazz(ActivityRxAndroid.class);
        list.add(rx);
        DemoBean ret=new DemoBean();
        ret.setDemoName("Retrofit");
        ret.setDemoClazz(ActivityRetrofit.class);
        list.add(ret);
        adapter=new DemolistAdapter(ActivityDemolist.this,list);
    }


    public class DemoBean{
        private String demoName;
        private Class demoClazz;

        public String getDemoName() {
            return demoName;
        }

        public void setDemoName(String demoName) {
            this.demoName = demoName;
        }

        public Class getDemoClazz() {
            return demoClazz;
        }

        public void setDemoClazz(Class demoClazz) {
            this.demoClazz = demoClazz;
        }
    }

}
