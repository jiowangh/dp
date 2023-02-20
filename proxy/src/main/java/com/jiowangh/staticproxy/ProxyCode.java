package com.jiowangh.staticproxy;

/**
 * @author wangjiong
 * @create 2023/2/20 15:03
 */
public class ProxyCode implements Code{

    private MyCode myCode;

    public ProxyCode(MyCode myCode){
        this.myCode = myCode;
    }

    public void code() {
        myCode.code();
    }
}
