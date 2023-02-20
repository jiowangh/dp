package com.jiowangh.prototype.serialization;

import java.io.Serializable;

/**
 * @author wangjiong
 * @create 2023/2/20 14:19
 */
public class AoTuMan implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    void show(){
        System.out.println("嫌疑人姓名: " +person.getName());
    }

    @Override
    public AoTuMan clone() throws CloneNotSupportedException {
        return (AoTuMan)super.clone();
    }
}
