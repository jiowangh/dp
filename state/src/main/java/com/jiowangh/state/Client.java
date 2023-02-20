package com.jiowangh.state;

/**
 * @author wangjiong
 * @create 2023/2/20 21:04
 */
public class Client {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.switchToYellow();
        trafficLight.switchToGreen();
        trafficLight.setState(new Yellow());
        trafficLight.switchToRed();
    }
}
