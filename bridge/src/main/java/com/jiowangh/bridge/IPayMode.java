package com.jiowangh.bridge;

/**
 * @author wangjiong
 * @create 2023/2/20 16:09
 */
public interface IPayMode {

    /**
     * 安全校验功能: 对各种支付模式进行风控校验
     * @param uId
     * @return
     */
    boolean validate(String uId);
}
