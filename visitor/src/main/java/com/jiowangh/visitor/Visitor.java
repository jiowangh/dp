package com.jiowangh.visitor;

/**
 * @author wangjiong
 * @create 2023/2/20 21:15
 */
public interface Visitor {

    public void visit(Candy candy);  //糖果重载方法

    public void visit(Wine wine);  //酒类重载方法

    public void visit(Fruit fruit);  //水果重载方法
}