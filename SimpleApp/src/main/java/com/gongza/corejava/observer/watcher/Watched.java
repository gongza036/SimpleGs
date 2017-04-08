package com.gongza.corejava.observer.watcher;

/**
 * Created by gongza on 2017/4/8.
 * 观察者
 */

public interface Watched {
    public void addWatcher(Watcher watcher);
    public void removeWacher(Watcher watcher);
    public void notifyWachers(String str);
}
