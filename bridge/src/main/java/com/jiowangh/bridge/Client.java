package com.jiowangh.bridge;

import java.math.BigDecimal;

/**
 * @author wangjiong
 * @create 2023/2/20 16:15
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("测试场景1: 微信支付、人脸方式.");
        Pay pay = new WxPay(new PayCypherMode());
        pay.transfer("ali_1234","10000",new BigDecimal(100));

        System.out.println();

        System.out.println("测试场景2: 支付宝支付、指纹方式");
        Pay pay1 = new AliPay(new PayFingerprintMode());
        pay1.transfer("wx_5678","10001",new BigDecimal(200));

    }

}
