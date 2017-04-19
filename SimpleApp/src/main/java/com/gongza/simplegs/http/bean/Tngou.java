package com.gongza.simplegs.http.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by gongza on 2017/4/19.
 */

public class Tngou {
    @SerializedName("status")
    private boolean status;
    @SerializedName("total")
    private long total;
    @SerializedName("tngou")
    private List<Cook> list;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<Cook> getList() {
        return list;
    }

    public void setList(List<Cook> list) {
        this.list = list;
    }
}
