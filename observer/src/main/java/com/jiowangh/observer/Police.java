package com.jiowangh.observer;

/**
 * @author wangjiong
 * @create 2023/2/20 19:36
 */
public class Police implements Observer{
    @Override
    public void Work() {
        System.out.println("copy,开始追...");
    }
}
