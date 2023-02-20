package com.jiowangh.bike;

/**
 * @author wangjiong
 * @create 2023/2/20 12:09
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
