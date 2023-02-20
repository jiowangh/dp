package com.jiowangh.prototype.cloneable;

/**
 * @author wangjiong
 * @create 2023/2/20 14:21
 * 浅拷贝，引用和基本数据类型都相同
 * 都一样，除了字符串，字符串变化的话会影响
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        AoTuMan ao1 = new AoTuMan();
        Person person = new Person();
        ao1.setPerson(person);
        AoTuMan ao2 = ao1.clone();
        Person person1 = ao2.getPerson();
        person.setName("wangjiong");
        person1.setName("jiowangh");
        ao1.setName("1");
        String s1 =ao1.getName();
                AoTuMan ao3 = ao1.clone();
        ao3.setName("3");
        String s3 =ao3.getName();
        System.out.println(ao1.getName() == ao3.getName());



        System.out.println( person == person1);
        System.out.println( person.getName() == person1.getName());
        System.out.println( person.getName() );
        System.out.println( person1.getName() );
        ao1.show();
        ao2.show();
    }
}
