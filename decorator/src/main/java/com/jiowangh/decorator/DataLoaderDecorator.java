package com.jiowangh.decorator;

/**
 * @author wangjiong
 * @create 2023/2/20 16:38
 */
public class DataLoaderDecorator implements DataLoader {

    private DataLoader wrapper;

    public DataLoaderDecorator(DataLoader wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public String read() {
        return wrapper.read();
    }

    @Override
    public void write(String data) {
        wrapper.write(data);
    }
}
