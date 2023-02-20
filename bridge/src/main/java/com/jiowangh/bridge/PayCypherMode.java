package com.jiowangh.bridge;

/**
 * @author wangjiong
 * @create 2023/2/20 16:13
 */
public class PayCypherMode implements IPayMode {

    @Override
    public boolean validate(String uId) {
        System.out.println("密码支付,风控校验-环境安全");
        return true;
    }

}
