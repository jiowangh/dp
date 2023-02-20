package com.jiowangh.strategy2;

/**
 * @author wangjiong
 * @create 2023/2/20 20:36
 */
public class Mt1011ReceiptHandleStrategy implements ReceiptHandleStrategy {

    @Override
    public void handleReceipt(Receipt receipt) {
        System.out.println("解析报文MT1011: " + receipt.getMessage());
    }
}