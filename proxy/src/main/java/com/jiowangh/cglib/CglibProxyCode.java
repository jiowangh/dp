package com.jiowangh.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author wangjiong
 * @create 2023/2/20 15:27
 * 需要实现MethodInterceptor接口，重写intercept方法
 */
public class CglibProxyCode implements MethodInterceptor {

    private Object object;

    public CglibProxyCode(Object object){
        this.object = object;
    }

    public Object getProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(("code").equals(method.getName())) {
            System.out.println(formatter.format(calendar.getTime()) + " [" + method.getName() + "] 查询用户信息...]");
        }
        Object o1 = methodProxy.invokeSuper(o, objects);
        return o1;
    }
}
