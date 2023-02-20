package com.jiowangh.facade;

/**
 * @author wangjiong
 * @create 2023/2/20 18:34
 */
public class SmartAppliancesFacade {
    private TV tv;
    private Light light;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        this.tv = new TV();
        this.light = new Light();
        this.airCondition = new AirCondition();
    }

    public void say(String msg){
        if("打开".equals(msg)){
            on();
        }else if("关闭".equals(msg)){
            off();
        }else{
            System.out.println("我还没学会！");
        }
    }

    public void on(){
        tv.on();
        light.on();
        airCondition.on();
    }

    public void off(){
        tv.off();
        light.off();
        airCondition.off();
    }

}
