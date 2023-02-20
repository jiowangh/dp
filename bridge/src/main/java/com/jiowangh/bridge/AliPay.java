package com.jiowangh.bridge;

import java.math.BigDecimal;

/**
 * @author wangjiong
 * @create 2023/2/20 16:14
 */
public class AliPay extends Pay{

    public AliPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {

        System.out.println("支付宝渠道支付划账开始......");

        boolean security = payMode.validate(uId);
        System.out.println("支付宝渠道支付风险校验: " + uId + " , " + tradeId +" , " + security);

        if(!security){
            System.out.println("支付宝渠道支付划账失败!");
            return "500";
        }

        System.out.println("支付宝渠道划账成功! 金额: "+ amount);
        return "200";
    }
}
