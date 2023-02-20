package com.jiowangh.observer2;

/**
 * @author wangjiong
 * @create 2023/2/20 19:55
 */
public class DrawHouseService {

    //摇号抽签
    public String lots(String uId){
        if(uId.hashCode() % 7 == 0){
            return "恭喜ID为: " + uId + " 的用户,在本次摇号中中签! !";
        }else{
            return "很遗憾,ID为: " + uId + "的用户,您本次未中签! !";
        }
    }
}