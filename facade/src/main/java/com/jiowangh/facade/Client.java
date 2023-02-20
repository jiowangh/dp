package com.jiowangh.facade;

/**
 * @author wangjiong
 * @create 2023/2/20 18:40
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade s = new SmartAppliancesFacade();
        s.say("打开");
        s.say("调整亮度");
        s.say("关闭");
    }
}
