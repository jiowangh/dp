package com.jiowangh.bridge;

/**
 * @author wangjiong
 * @create 2023/2/20 16:11
 */
public class PayFingerprintMode implements IPayMode{
    @Override
    public boolean validate(String uId) {
        System.out.println("指纹支付,风控校验-指纹信息");
        return true;
    }
}
