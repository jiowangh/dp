package com.jiowangh.bridge;

import java.math.BigDecimal;

/**
 * @author wangjiong
 * @create 2023/2/20 16:13
 */
public abstract class Pay {

    //桥接对象
    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    //划账功能
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);

}
