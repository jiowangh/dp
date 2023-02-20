package com.jiowangh.jdkproxy;

/**
 * @author wangjiong
 * @create 2023/2/20 15:12
 */
public class Client {
    public static void main(String[] args) {
        //必须在main方法中执行，直接用junit的test方法调用无法生成
        //JDK1.8之后在main方法最前面增加
        // System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");
        //JDK1.8及其之前在main方法最前面增加
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        Code code = new MyCode();
        System.out.println(code.getClass());
        Code proxyCode = (Code) new JdkProxyCode(code).getProxyInstance();
        System.out.println(proxyCode.getClass());
        proxyCode.code();

    }
}
