package com.jiowangh.staticproxy;

/**
 * @author wangjiong
 * @create 2023/2/20 15:05
 */
public class Client {
    public static void main(String[] args) {
        ProxyCode proxyCode = new ProxyCode(new MyCode());
        proxyCode.code();
    }

}
