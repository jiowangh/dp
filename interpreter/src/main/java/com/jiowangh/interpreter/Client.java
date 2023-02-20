package com.jiowangh.interpreter;

/**
 * @author wangjiong
 * @create 2023/2/20 21:41
 */
public class Client {
    public static void main(String[] args) {
        NumExpression e = new NumExpression(11);
        NumExpression e2 = new NumExpression(22);
        MulExpression mulExpression = new MulExpression(e,e2);
        long result = mulExpression.interpret();
        System.out.println(result);


    }

}
