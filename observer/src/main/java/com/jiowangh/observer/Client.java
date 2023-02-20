package com.jiowangh.observer;

import sun.applet.Main;

/**
 * @author wangjiong
 * @create 2023/2/20 19:41
 */
public class Client {
    public static void main(String[] args) {
        Police police = new Police();
        BadMan badMan = new BadMan();
        badMan.add(police);
        badMan.run();
    }
}
