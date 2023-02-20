package com.jiowangh.iterator;

import java.util.ArrayList;

/**
 * @author wangjiong
 * @create 2023/2/20 21:07
 */
public class Iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("11");
        list.add("22");
        list.add("33");
        list.add("44");
        for (String list1 : list) {
            System.out.println(list1);
        }
        java.util.Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
