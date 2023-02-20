package com.jiowangh.factory.abstractfactory;

/**
 * @author wangjiong
 * @create 2023/2/20 10:30
 * 抽线工厂即多个工厂
 */
public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new BMWFactory();
        Car car = carFactory.createCar();
        car.start();
        car.stop();

        carFactory = new BenZFactory();
        car = carFactory.createCar();
        car.start();
        car.stop();
    }
}
