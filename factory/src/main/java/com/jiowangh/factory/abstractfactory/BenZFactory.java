package com.jiowangh.factory.abstractfactory;

/**
 * @author wangjiong
 * @create 2023/2/20 10:27
 */
public class BenZFactory implements CarFactory{
    public Car createCar() {
        return new BenZCar();
    }
}
