package com.jiowangh.mediator;

/**
 * @author wangjiong
 * @create 2023/2/20 21:46
 */
public abstract class Person {

    protected String name;

    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}