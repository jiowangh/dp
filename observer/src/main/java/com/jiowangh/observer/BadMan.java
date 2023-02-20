package com.jiowangh.observer;

import java.util.ArrayList;

/**
 * @author wangjiong
 * @create 2023/2/20 19:37
 */
public class BadMan implements Observable{

    public ArrayList<Observer> list = new ArrayList();

    @Override
    public void add(Observer observer) {
        this.list.add(observer);
    }

    @Override
    public void del(Observer observer) {
        this.list.remove(observer);
    }

    @Override
    public void notifyOb() {
        for (Observer ob:list) {
            ob.Work();
        }
    }

    public void run(){
        System.out.println("罪犯潜逃了...");
        this.notifyOb();
    }
}
