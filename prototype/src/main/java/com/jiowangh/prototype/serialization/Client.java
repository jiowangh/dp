package com.jiowangh.prototype.serialization;

import java.io.*;

/**
 * @author wangjiong
 * @create 2023/2/20 14:38
 * 都不一样
 */
public class Client {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("AoTuMan.obj"));
        AoTuMan aoTuMan = new AoTuMan();
        Person person = new Person();
        aoTuMan.setPerson(person);
        oos.writeObject(aoTuMan);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("AoTuMan.obj"));
        AoTuMan aoTuMan1 = (AoTuMan)ois.readObject();
        System.out.println(aoTuMan1.getPerson() == aoTuMan.getPerson());


    }
}
