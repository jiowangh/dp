package com.jiowangh.adapter;

/**
 * @author wangjiong
 * @create 2023/2/20 16:49
 */
public class SDAdapterTF extends  TFCardImpl implements SDCard{

    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
