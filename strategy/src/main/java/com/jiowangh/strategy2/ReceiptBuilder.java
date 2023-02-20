package com.jiowangh.strategy2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangjiong
 * @create 2023/2/20 20:35
 */
public class ReceiptBuilder {

    public static List<Receipt> genReceiptList(){
        //模拟回执信息
        List<Receipt> receiptList = new ArrayList<>();
        receiptList.add(new Receipt("MT1101回执","MT1011"));
        receiptList.add(new Receipt("MT2101回执","MT2101"));


        //......
        return receiptList;
    }

}