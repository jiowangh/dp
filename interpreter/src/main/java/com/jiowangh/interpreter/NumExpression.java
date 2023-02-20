package com.jiowangh.interpreter;

/**
 * @author wangjiong
 * @create 2023/2/20 21:40
 */
public class NumExpression implements Expression {

    private long number;

    public NumExpression(long number) {
        this.number = number;
    }

    public NumExpression(String number) {
        this.number = Long.parseLong(number);
    }

    @Override
    public long interpret() {
        return this.number;
    }
}