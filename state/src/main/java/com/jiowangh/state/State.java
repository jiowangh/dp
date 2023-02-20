package com.jiowangh.state;

/**
 * @author wangjiong
 * @create 2023/2/20 21:03
 */
public interface State {
    void switchToGreen(TrafficLight trafficLight); //切换为绿灯

    void switchToYellow(TrafficLight trafficLight); //切换为黄灯

    void switchToRed(TrafficLight trafficLight); //切换为红灯
}
