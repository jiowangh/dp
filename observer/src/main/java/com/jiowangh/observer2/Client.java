package com.jiowangh.observer2;

import java.util.Random;

/**
 * @author wangjiong
 * @create 2023/2/20 19:58
 */
public class Client {
    public static void main(String[] args) {
        LotteryService ls = new LotteryServiceImpl();
        Random rm = new Random();
        int uuid = rm.nextInt(100000000);
        LotteryResult result  = ls.lotteryAndMsg(uuid+"");
        System.out.println(result);
    }
}
