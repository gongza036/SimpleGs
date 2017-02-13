package com.gongza.library.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by gongza on 2017/2/13.
 */

public class NestListview extends ListView {


    public NestListview(Context context) {
        super(context);
        setMotionEventSplittingEnabled(false);
    }

    public NestListview(Context context, AttributeSet attrs) {
        super(context, attrs);
        setMotionEventSplittingEnabled(false);
    }

    public NestListview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setMotionEventSplittingEnabled(false);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }


}