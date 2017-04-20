package com.gongza.simplegs.http.service;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by gongza on 2017/4/20.
 */

public interface ServiceBaidu {
    @GET("/")
    Call<String> getBaidu();
}
