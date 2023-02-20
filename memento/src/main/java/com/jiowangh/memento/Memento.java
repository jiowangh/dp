package com.jiowangh.memento;

/**
 * @author wangjiong
 * @create 2023/2/20 21:27
 */
public class Memento {
    //男孩的状态
    private String state = "";
    //通过构造函数传递状态信息
    public Memento(String _state){
        this.state = _state;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}
