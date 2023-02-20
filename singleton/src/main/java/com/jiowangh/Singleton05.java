package com.jiowangh;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author wangjiong
 * @create 2023/2/20 9:05
 * 静态内部类，只会初始化一次，但是会被反射破坏
 */
public class Singleton05 {

    private Singleton05() {

        if(null != Singleton05Handler.singleton05){
            throw new RuntimeException("不允许反射创建对象");
        }

    }

    public static Singleton05 getSingleton05(){
            return Singleton05Handler.singleton05;
    }

    private static class Singleton05Handler {
        private static Singleton05 singleton05 = new Singleton05();
    }

    /**
     * 反射破坏
     * 解决：可以在构造方法中抛出异常
     * @param args
     */
    public static void main(String[] args) {
        reflectionDestroy();//反射破坏
    }

    public static void reflectionDestroy(){
        Class<Singleton05> singleton05Class = Singleton05.class;
        try {
            Constructor constructor = singleton05Class.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            try {
                Object o1 = constructor.newInstance();
                Object o2 = constructor.newInstance();
                System.out.println(o1 == o2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
