package com.jiowangh.observer2;

/**
 * @author wangjiong
 * @create 2023/2/20 19:48
 */
public class MQEventListener implements EventListener {

    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("记录用户摇号结果(MQ), 用户ID:" +  result.getuId() +
                ",摇号结果:" + result.getMsg());
    }
}