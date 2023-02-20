package com.jiowangh.cglib;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @author wangjiong
 * @create 2023/2/20 15:32
 */
public class Client {
    public static void main(String[] args) {
        // 指定 CGLIB 将动态生成的代理类保存至指定的磁盘路径下
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "proxy\\cglibproxy");
        MyCode myCode = new MyCode();
        System.out.println(myCode);
        MyCode myCode1 =(MyCode) new CglibProxyCode(myCode).getProxy();
        System.out.println(myCode1);
        myCode1.code();
    }



}
