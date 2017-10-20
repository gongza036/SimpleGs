package com.gongza.simplegs.activity.other;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.gongza.simplegs.R;

/**
 * Created by gongza on 2017/10/20.
 */

public class ActivityEchartsInWebview extends Activity {
    private WebView webview;
    private Button bt_echarts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echarts);
        init();

    }

    private void init(){
        bt_echarts=(Button) findViewById(R.id.bt_echarts);
        webview=(WebView)findViewById(R.id.webview);

        //开启本地文件读取（默认为true，不设置也可以）
        webview.getSettings().setAllowFileAccess(true);
        //设置编码
        webview.getSettings().setDefaultTextEncodingName("utf-8");
        // 设置可以支持缩放
        webview.getSettings().setSupportZoom(true);
        // 设置出现缩放工具
        webview.getSettings().setBuiltInZoomControls(true);
        //设置加载进来的页面自适应手机屏幕
        webview.getSettings().setUseWideViewPort(true);
        webview.getSettings().setLoadWithOverviewMode(true);
        // 清除浏览器缓存
        webview.clearCache(true);
        //开启脚本支持
        webview.getSettings().setJavaScriptEnabled(true);


        webview.loadUrl("file:///android_asset/testEcharts/test.html");
        bt_echarts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.loadUrl("javascript:createChart();");
            }
        });
    }
}
