package com.jiowangh.bridge;

/**
 * @author wangjiong
 * @create 2023/2/20 16:12
 */
public class PayFaceMode implements IPayMode {

    @Override
    public boolean validate(String uId) {
        System.out.println("人脸支付,风控校验-脸部识别");
        return true;
    }

}
