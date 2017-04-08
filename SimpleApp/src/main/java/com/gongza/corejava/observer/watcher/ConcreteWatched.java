package com.gongza.corejava.observer.watcher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gongza on 2017/4/8.
 * 观察者的具体实现
 */

public class ConcreteWatched implements Watched {
    private List<Watcher> list = new ArrayList<>();

    @Override
    public void addWatcher(Watcher watcher) {
        list.add(watcher);
    }

    @Override
    public void removeWacher(Watcher watcher) {
        list.remove(watcher);
    }

    @Override
    public void notifyWachers(String str) {
        for (Watcher watcher : list) {
            watcher.update(str);
        }
    }
}
