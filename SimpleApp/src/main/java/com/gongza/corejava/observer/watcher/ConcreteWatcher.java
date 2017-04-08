package com.gongza.corejava.observer.watcher;

/**
 * Created by gongza on 2017/4/8.
 * 被观察者的具体实现
 */

public class ConcreteWatcher implements Watcher {
    @Override
    public void update(String str) {
        System.out.println(str);
    }
}
