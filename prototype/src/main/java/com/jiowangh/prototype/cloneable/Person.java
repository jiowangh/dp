package com.jiowangh.prototype.cloneable;

/**
 * @author wangjiong
 * @create 2023/2/20 14:17
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
