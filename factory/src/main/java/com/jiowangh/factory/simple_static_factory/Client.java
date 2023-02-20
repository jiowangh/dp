package com.jiowangh.factory.simple_static_factory;

/**
 * @author wangjiong
 * @create 2023/2/20 11:02
 */
public class Client {
    public static void main(String[] args) {
//        HumanFactory humanFactory = new HumanFactory();
        Human chinaMan = HumanFactory.createHuman(ChinaMan.class);
        chinaMan.eat();
        Human chinaWoman = HumanFactory.createHuman(ChinaWoman.class);
        chinaWoman.eat();
    }
}
