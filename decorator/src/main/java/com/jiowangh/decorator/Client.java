package com.jiowangh.decorator;

/**
 * @author wangjiong
 * @create 2023/2/20 16:40
 */
public class Client {
    public static void main(String[] args) {
        String info = "name:wangjiong,age:28";
        DataLoaderDecorator dataLoaderDecorator = new EncryptionDataDecorator(new BaseFileDataLoader("demo.txt"));
        dataLoaderDecorator.write(info);
        String read = dataLoaderDecorator.read();
        System.out.println(read);

    }

}
