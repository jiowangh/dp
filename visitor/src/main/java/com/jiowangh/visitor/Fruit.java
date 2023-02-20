package com.jiowangh.visitor;

import java.time.LocalDate;

/**
 * @author wangjiong
 * @create 2023/2/20 21:17
 */
public class Fruit extends Product implements Acceptable{

    //重量
    private float weight;

    public Fruit(String name, LocalDate producedDate, double price, float weight) {
        super(name, producedDate, price);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        //accept实现方法中调用访问者并将自己 "this" 传回。this是一个明确的身份,不存在任何泛型
        visitor.visit(this);
    }
}