package com.jiowangh.factory.abstractfactory;

/**
 * @author wangjiong
 * @create 2023/2/20 10:26
 */
public class BMWCar implements Car{
    public void start() {
        System.out.println("宝马启动");
    }

    public void stop() {
        System.out.println("宝马停止");
    }
}
