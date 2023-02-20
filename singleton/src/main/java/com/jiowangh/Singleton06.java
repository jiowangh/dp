package com.jiowangh;

import java.io.*;

/**
 * @author wangjiong
 * @create 2023/2/20 9:30
 */
public class Singleton06 implements Serializable {
    private volatile static Singleton06 singleton;

    private Singleton06() {

    }

    public static Singleton06 getInstance() {
        if (singleton == null) {
            synchronized (Singleton06.class) {
                if (singleton == null) {
                    singleton = new Singleton06();
                }
            }
        }
        return singleton;
    }

    /**
     * 序列化破坏
     * readOrdinaryObject()
     * 方法在通过反射创建完对象后，会有一个条件判断
     * 如果对象所在的类存在 readResolve() 方法
     * 则会改为使用 readResolve() 方法获取实例对象，而不是利用反射创建出来的对象
     * @param args
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.obj"));
        oos.writeObject(Singleton06.getInstance());

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.obj"));
        Singleton06 singleton06 = (Singleton06) ois.readObject();

        System.out.println(Singleton06.getInstance() == singleton06);

    }

    public Object readResolve(){
        return singleton;
    }
}
