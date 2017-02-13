package com.gongza.simplegs.activity.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.gongza.simplegs.DemolistActivity;
import com.gongza.simplegs.R;

import java.util.ArrayList;

/**
 * Created by gongza on 2017/2/9.
 */

public class DemolistAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<DemolistActivity.DemoBean> list;
    private LayoutInflater inflater;

    public DemolistAdapter(Context mContext, ArrayList<DemolistActivity.DemoBean> list) {
        inflater = LayoutInflater.from(mContext);
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_demolist_item, null);
        Button bt_demo= (Button) view.findViewById(R.id.bt_demo);
        bt_demo.setText(list.get(i).getDemoName());
        bt_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mContext.startActivity(new Intent(mContext,list.get(i).getDemoClazz()));
            }
        });

        return view;
    }
}
