package com.jiowangh.bike;

/**
 * @author wangjiong
 * @create 2023/2/20 12:18
 */
public class MobikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        mBike.setFrame("摩拜车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("摩拜车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
