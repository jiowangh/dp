package com.jiowangh.state;

/**
 * @author wangjiong
 * @create 2023/2/20 21:02
 */
public class TrafficLight {

    //初始状态红灯
    State state = new Red();

    public void setState(State state) {
        this.state = state;
    }

    //切换为绿灯状态
    public void switchToGreen(){
        state.switchToGreen(this);
    }

    //切换为黄灯状态
    public void switchToYellow(){
        state.switchToYellow(this);
    }

    //切换为红灯状态
    public void switchToRed(){
        state.switchToRed(this);
    }
}