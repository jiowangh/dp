package com.jiowangh;

/**
 * @author wangjiong
 * @create 2023/2/20 9:38
 * 枚举不允许通过反射创建，会抛出异常
 * 其序列化只是序列化对象名
 * 反序列化时枚举对象名直接引用已经存在的枚举对象，不会去自己创建
 */
public enum Singleton07 {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Singleton07 getInstance(){
        return INSTANCE;
    }
}
