package com.jiowangh.strategy2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangjiong
 * @create 2023/2/20 20:38
 */
public class ReceiptHandleStrategyFactory {

    public ReceiptHandleStrategyFactory() {
    }

    //使用Map集合存储策略信息,彻底消除if...else
    private static Map<String,ReceiptHandleStrategy> strategyMap;

    //初始化具体策略,保存到map集合
    public static void init(){
        strategyMap = new HashMap<>();
        strategyMap.put("MT1011",new Mt1011ReceiptHandleStrategy());
        strategyMap.put("MT2101",new Mt2101ReceiptHandleStrategy());
    }

    //根据回执类型获取对应策略类对象
    public static ReceiptHandleStrategy getReceiptHandleStrategy(String receiptType){
        return strategyMap.get(receiptType);
    }
}