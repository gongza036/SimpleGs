package com.gongza.corejava.observer.api;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by gongza on 2017/4/8.
 * 用java API 实现的观察者
 */

public class SimpleObserver implements Observer {

    public SimpleObserver(SimpleObservable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("data is changed,data==" + ((SimpleObservable) o).getData());
    }
}
