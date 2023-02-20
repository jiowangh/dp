package com.jiowangh.bike;

/**
 * @author wangjiong
 * @create 2023/2/20 12:17
 */
public class HelloBuilder extends Builder{
    @Override
    public void buildFrame() {
        mBike.setFrame("哈喽车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("哈喽车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }


}
