package com.jiowangh.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wangjiong
 * @create 2023/2/20 15:08
 */
public class JdkProxyCode {
    private Object object;

    public JdkProxyCode(Object object){
        this.object = object;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk代理前");
                        method.invoke(object,args);
                        System.out.println("jdk代理后");
                        return null;
                    }
                });
    }
}
