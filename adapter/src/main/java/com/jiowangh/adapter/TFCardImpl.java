package com.jiowangh.adapter;

/**
 * @author wangjiong
 * @create 2023/2/20 16:48
 */
public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {

        String msg = "tf card reading data";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("tf card write data : " + msg);
    }
}
