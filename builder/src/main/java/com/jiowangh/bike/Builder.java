package com.jiowangh.bike;

/**
 * @author wangjiong
 * @create 2023/2/20 12:03
 */
public abstract class Builder {
    protected  Bike mBike = new Bike();

    /**
     * 创建车架
     */
    public abstract void buildFrame();

    /**
     * 创建车座
     */
    public abstract void buildSeat();


    /**
     * 创建车
     * @return 具体类型的车
     */
    public abstract Bike createBike();

}
