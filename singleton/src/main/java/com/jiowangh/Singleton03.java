package com.jiowangh;

/**
 * @author wangjiong
 * @create 2023/2/20 8:54
 * 懒汉模式，方法上加锁，多线程影响性能
 */
public class Singleton03 {
    private Singleton03(){}

    private static Singleton03 singleton03;

    public synchronized static Singleton03 getSingleton03(){
        if (null == singleton03){
            return new Singleton03();
        }
        return singleton03;
    }
}
