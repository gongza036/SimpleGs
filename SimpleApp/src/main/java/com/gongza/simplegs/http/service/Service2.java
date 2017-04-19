package com.gongza.simplegs.http.service;

import com.gongza.simplegs.http.bean.Tngou;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by gongza on 2017/4/19.
 */

public interface Service2 {
    @POST("/api/cook/list")
    @FormUrlEncoded
    Call<Tngou> getList(@Field("id") int id, @Field("page") int page, @Field("rows") int rows);
}
