package com.jiowangh;

/**
 * @author wangjiong
 * @create 2023/2/20 8:50
 * 饿汉模式
 */
public class Singleton01 {
    private Singleton01(){
    }

    private static Singleton01 singleton01 = new Singleton01();

    public static Singleton01 getSingleton01(){
        return new Singleton01();
    }

}
