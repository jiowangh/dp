package com.jiowangh.visitor;

import java.time.LocalDate;

/**
 * @author wangjiong
 * @create 2023/2/20 21:16
 */
public class Wine extends Product implements Acceptable{

    public Wine(String name, LocalDate producedDate, double price) {
        super(name, producedDate, price);
    }
    @Override
    public void accept(Visitor visitor) {
        //accept实现方法中调用访问者并将自己 "this" 传回。this是一个明确的身份,不存在任何泛型
        visitor.visit(this);
    }
}