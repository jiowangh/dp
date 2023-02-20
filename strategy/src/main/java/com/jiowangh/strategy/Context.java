package com.jiowangh.strategy;

/**
 * @author wangjiong
 * @create 2023/2/20 20:31
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy  = strategy;
    }

    public void run(){
        strategy.algorithm();
    }
}
