package com.jiowangh.memento;

/**
 * @author wangjiong
 * @create 2023/2/20 21:28
 */
public class Caretaker {
    //备忘录对象
    private Memento memento;
    public Memento getMemento() {
        return memento;
    }
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
