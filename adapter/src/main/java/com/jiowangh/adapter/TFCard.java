package com.jiowangh.adapter;

/**
 * @author wangjiong
 * @create 2023/2/20 16:47
 */
public interface TFCard {
    //读取TF卡方法
    String readTF();
    //写入TF卡功能
    void writeTF(String msg);
}
