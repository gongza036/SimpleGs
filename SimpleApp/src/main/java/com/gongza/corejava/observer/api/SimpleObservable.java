package com.gongza.corejava.observer.api;

import java.util.Observable;

/**
 * Created by gongza on 2017/4/8.
 * 用java API 继承的被观察者
 */

public class SimpleObservable extends Observable {
    private int data = 0;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        if (this.data != data) {
            this.data = data;
            setChanged();//发生改变
            notifyObservers();//通知观察者，表示状态发生改变
        }
    }
}
