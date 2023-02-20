package com.jiowangh.factory.abstractfactory;

/**
 * @author wangjiong
 * @create 2023/2/20 10:28
 */
public class BenZCar implements Car{
    public void start() {
        System.out.println("奔驰启动");
    }

    public void stop() {
        System.out.println("奔驰停止");
    }
}
