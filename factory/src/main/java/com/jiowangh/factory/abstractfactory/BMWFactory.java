package com.jiowangh.factory.abstractfactory;

/**
 * @author wangjiong
 * @create 2023/2/20 10:26
 */
public class BMWFactory implements CarFactory{

    public Car createCar() {
        return new BMWCar();
    }
}
