package com.gongza.simplegs.http.service;

import com.gongza.simplegs.http.bean.Tngou;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by gongza on 2017/4/19.
 */

public interface Service {
    @GET("/api/cook/list")
    Call<Tngou> getList(@Query("id") int id,@Query("page") int page,@Query("rows") int rows);
}
