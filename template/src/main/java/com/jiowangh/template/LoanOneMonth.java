package com.jiowangh.template;

/**
 * @author wangjiong
 * @create 2023/2/20 20:19
 */
public class LoanOneMonth extends Account{

    @Override
    public void calculate() {
        System.out.println("借款周期30天,利率为10%!");
    }

    @Override
    public void display() {
        System.out.println("七日内借款无利息!");
    }
}