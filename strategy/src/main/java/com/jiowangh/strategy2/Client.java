package com.jiowangh.strategy2;

import java.util.List;

/**
 * @author wangjiong
 * @create 2023/2/20 20:38
 */
public class Client {
    public static void main(String[] args) {
        //模拟回执
        List<Receipt> receiptList = ReceiptBuilder.genReceiptList();

        //策略上下文
        ReceiptStrategyContext context = new ReceiptStrategyContext();

        //策略模式将策略的 定义、创建、使用这三部分进行了解耦
        for (Receipt receipt : receiptList) {
            //获取置策略
            ReceiptHandleStrategyFactory.init();
            ReceiptHandleStrategy strategy = ReceiptHandleStrategyFactory.getReceiptHandleStrategy(receipt.getType());
            //设置策略
            context.setReceiptHandleStrategy(strategy);
            //执行策略
            context.handleReceipt(receipt);
        }
    }
}
