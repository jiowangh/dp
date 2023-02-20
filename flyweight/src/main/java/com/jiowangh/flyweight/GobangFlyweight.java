package com.jiowangh.flyweight;

/**
 * @author wangjiong
 * @create 2023/2/20 19:06
 */
public abstract class GobangFlyweight {

    public abstract String getColor();

    public void display(){
        System.out.println("棋子颜色: " + this.getColor());
    }
}
