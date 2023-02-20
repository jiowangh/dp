package com.jiowangh.template;

/**
 * @author wangjiong
 * @create 2023/2/20 20:20
 */
public class Client {
    public static void main(String[] args) {
        Account a1 = new LoanSevenDays();
        a1.handle("tom","123456");

        System.out.println("==========================");

        Account a2 = new LoanOneMonth();
        a2.handle("tom","123456");
    }
}
