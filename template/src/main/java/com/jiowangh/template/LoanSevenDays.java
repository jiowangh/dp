package com.jiowangh.template;

/**
 * @author wangjiong
 * @create 2023/2/20 20:19
 */
public class LoanSevenDays extends Account{

    @Override
    public void calculate() {
        System.out.println("借款周期7天,无利息!仅收取贷款金额1%的服务费!");
    }

    @Override
    public void display() {
        System.out.println("借款金额10%的利息!!");
    }

}