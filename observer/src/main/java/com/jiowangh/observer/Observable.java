package com.jiowangh.observer;

/**
 * @author wangjiong
 * @create 2023/2/20 19:35
 */
public interface Observable {
    void add(Observer observer);
    void del(Observer observer);
    void notifyOb();
}
