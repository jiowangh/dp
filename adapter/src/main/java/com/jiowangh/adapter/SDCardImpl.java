package com.jiowangh.adapter;

/**
 * @author wangjiong
 * @create 2023/2/20 16:47
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "sd card reading data";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("sd card write data : " + msg);
    }
}
