package com.jiowangh.factory.factorymethod;

/**
 * @author wangjiong
 * @create 2023/2/20 11:09
 */
public abstract class AbstractHumanFactory {
    public abstract  <T extends Human> T createHuman(Class<T> c);

}
