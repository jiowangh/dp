package com.jiowangh.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangjiong
 * @create 2023/2/20 21:36
 */
public class Order {

    private int diningTable;  //餐桌号码

    //存储菜名与份数
    private Map<String,Integer> foodMenu = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodMenu() {
        return foodMenu;
    }

    public void setFoodDic(Map<String, Integer> foodMenu) {
        this.foodMenu = foodMenu;
    }
}