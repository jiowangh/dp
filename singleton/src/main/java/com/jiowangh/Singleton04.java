package com.jiowangh;

import java.io.Serializable;

/**
 * @author wangjiong
 * @create 2023/2/20 8:58
 * 懒汉模式，双重校验锁
 * 保证变量的可见性**：当一个被volatile关键字修饰的变量被一个线程修改的时候，其他线程可以立刻得到修改之后的结果。
 * 屏蔽指令重排序**：指令重排序是编译器和处理器为了高效对程序进行优化的手段，它只能保证程序执行的结果时正确的，
 * 但是无法保证程序的操作顺序与代码顺序一致。这在单线程中不会构成问题，但是在多线程中就会出现问题。
 */
public class Singleton04 implements Serializable {
    private Singleton04(){}

    /**
     * volatile 关键字,其作用有两个
     * 1,保证变量的可见性：当一个被volatile关键字修饰的变量被一个线程修改的时候，其他线程可以立刻得到修改之后的结果。
     * 2,屏蔽指令重排序.
     */
    private volatile static Singleton04 singleton04 = null;

    public static Singleton04 getSingleton04(){
        if (null == singleton04){
            synchronized (Singleton04.class){
                if (null==singleton04){
                    return new Singleton04();
                }
            }
        }
        return singleton04;
    }
}
