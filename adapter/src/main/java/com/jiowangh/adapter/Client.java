package com.jiowangh.adapter;

/**
 * @author wangjiong
 * @create 2023/2/20 16:50
 */
public class Client {
    public static void main(String[] args) {

        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.read(sdCard));

        System.out.println("========================");
        SDAdapterTF adapterTF = new SDAdapterTF();
        System.out.println(computer.read(adapterTF));
    }
}
