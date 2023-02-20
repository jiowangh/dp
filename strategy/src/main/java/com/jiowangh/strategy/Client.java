package com.jiowangh.strategy;

/**
 * @author wangjiong
 * @create 2023/2/20 20:32
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyB();
        Context context = new Context(strategy);
        context.run();
    }
}
