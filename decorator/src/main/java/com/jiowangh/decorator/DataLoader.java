package com.jiowangh.decorator;

/**
 * @author wangjiong
 * @create 2023/2/20 16:35
 */
public interface DataLoader {
    String read();
    void write(String data);
}
