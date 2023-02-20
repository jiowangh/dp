package com.jiowangh.strategy2;

/**
 * @author wangjiong
 * @create 2023/2/20 20:36
 */
public class Mt2101ReceiptHandleStrategy implements ReceiptHandleStrategy {

    @Override
    public void handleReceipt(Receipt receipt) {
        System.out.println("解析报文MT2101: " + receipt.getMessage());
    }
}