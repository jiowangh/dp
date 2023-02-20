package com.jiowangh.visitor;

/**
 * @author wangjiong
 * @create 2023/2/20 21:15
 */
public interface Acceptable {

    //接收所有的Visitor访问者的子类实现类
    public void accept(Visitor visitor);
}