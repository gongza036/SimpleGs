package com.gongza.simplegs.activity.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.gongza.library.views.swipeview.SwipeLayout;
import com.gongza.simplegs.R;
import com.gongza.simplegs.activity.layout.ActivitySwipeScroview;

import java.util.ArrayList;

/**
 * Created by gongza on 2017/2/9.
 */

public class SwipelistAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<String> list;
    private LayoutInflater inflater;

    public SwipelistAdapter(Context mContext, ArrayList<String> list) {
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
        view = inflater.inflate(R.layout.layout_swipelist_item, null);
        SwipeLayout swipelayout = (SwipeLayout) view.findViewById(R.id.swipelayout);
        swipelayout.setOnSwipeLayoutClickListener(new SwipeLayout.OnSwipeLayoutClickListener() {
            @Override
            public void onClick() {
                mContext.startActivity(new Intent(mContext,ActivitySwipeScroview.class));
            }
        });
        ImageView iv_name= (ImageView) view.findViewById(R.id.iv_name);
        TextView tv_name= (TextView) view.findViewById(R.id.tv_name);

        iv_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,"图片"+i,Toast.LENGTH_SHORT).show();
            }
        });

        tv_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,"文字"+i,Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
