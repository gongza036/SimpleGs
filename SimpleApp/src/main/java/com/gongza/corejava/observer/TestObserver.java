package com.gongza.corejava.observer;

import com.gongza.corejava.observer.watcher.ConcreteWatched;
import com.gongza.corejava.observer.watcher.ConcreteWatcher;
import com.gongza.corejava.observer.watcher.Watched;
import com.gongza.corejava.observer.watcher.Watcher;

/**
 * Created by gongza on 2017/4/8.
 */

public class TestObserver {
    public static void main(String[] args) {
        System.out.println("TestObserver--观察者模式");

        showWatcher();
    }

    private static void showWatcher() {
        //观察者模式简单实现
        Watched watched = new ConcreteWatched();
        //三个被观察者
        Watcher watcher1 = new ConcreteWatcher();
        Watcher watcher2 = new ConcreteWatcher();
        Watcher watcher3 = new ConcreteWatcher();
        watched.addWatcher(watcher1);
        watched.addWatcher(watcher2);
        watched.addWatcher(watcher3);
        watched.notifyWachers("变化了");
    }


}
