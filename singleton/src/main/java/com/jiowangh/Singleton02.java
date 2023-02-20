package com.jiowangh;

/**
 * @author wangjiong
 * @create 2023/2/20 8:50
 * 懒汉模式，有线程并发问题
 */
public class Singleton02 {
    private Singleton02(){}

    private static Singleton02 singleton02;

    public static Singleton02 getSingleton02(){
        if (null == singleton02){
            return new Singleton02();
        }
        return singleton02;
    }
}
