package com.jiowangh.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangjiong
 * @create 2023/2/20 19:10
 */
public class GobangFactory {

    //private static GobangFactory factory = new GobangFactory();

    private static Map<String,GobangFlyweight> pool;

    //设置共享对象的内部状态,在享元对象中传递
    private GobangFactory() {
        pool = new HashMap<String,GobangFlyweight>();
        GobangFlyweight black = new BlackGobang(); //黑子
        GobangFlyweight white = new WhiteGobang(); //白子
        pool.put("b",black);
        pool.put("w",white);
    }

    //返回享元工厂类唯一实例
    public static final GobangFactory getInstance(){
        return SingletonHolder.INSTANCE;
    }

    //静态内部类-单例
    private static class SingletonHolder{
        private static final GobangFactory INSTANCE = new GobangFactory();
    }

    //通过key获取集合中的享元对象
    public GobangFlyweight getGobang(String key){
        return pool.get(key);
    }
}