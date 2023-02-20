package com.jiowangh.bike;

/**
 * @author wangjiong
 * @create 2023/2/20 12:00
 */
public class Client {
    public static void main(String[] args) {
        showBike(new HelloBuilder());
        showBike(new MobikeBuilder());
    }

    public static  void showBike(Builder builder){
        Director director = new Director(builder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());

    }
}
