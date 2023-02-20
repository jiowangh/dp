package com.jiowangh.factory.factorymethod;

/**
 * @author wangjiong
 * @create 2023/2/20 11:02
 */
public class Client {
    public static void main(String[] args) {
        HumanFactory humanFactory = new HumanFactory();
        Human chinaMan = humanFactory.createHuman(ChinaMan.class);
        chinaMan.eat();
        Human chinaWoman = humanFactory.createHuman(ChinaWoman.class);
        chinaWoman.eat();
    }
}
