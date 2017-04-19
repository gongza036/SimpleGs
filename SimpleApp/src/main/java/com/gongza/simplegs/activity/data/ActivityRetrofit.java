package com.gongza.simplegs.activity.data;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.gongza.simplegs.R;
import com.gongza.simplegs.http.bean.Cook;
import com.gongza.simplegs.http.bean.Tngou;
import com.gongza.simplegs.http.service.Service2;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by gongza on 2017/4/8.
 */

public class ActivityRetrofit extends Activity implements Callback<Tngou> {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showHttp();
    }

    //http://www.tngou.net/api/cook/list
    private String url = "http://www.tngou.net";

    private void showHttp() {
        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //get请求
//        Service mService = mRetrofit.create(Service.class);
        //post请求
        Service2 mService = mRetrofit.create(Service2.class);
        Call<Tngou> call = mService.getList(0, 1, 20);
        call.enqueue(this);
    }


    @Override
    public void onResponse(Call<Tngou> call, Response<Tngou> response) {
        List<Cook> list = response.body().getList();
//        Toast.makeText(ActivityRetrofit.this,""+list.toString(),Toast.LENGTH_SHORT).show();
        TextView tv_h = (TextView) findViewById(R.id.tv_h);
        tv_h.setText(list.toString());
    }

    @Override
    public void onFailure(Call<Tngou> call, Throwable t) {
        t.printStackTrace();
    }
}
