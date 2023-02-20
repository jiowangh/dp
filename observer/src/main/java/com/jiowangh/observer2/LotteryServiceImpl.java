package com.jiowangh.observer2;

import java.util.Date;

/**
 * @author wangjiong
 * @create 2023/2/20 19:57
 */
public class LotteryServiceImpl extends LotteryService {

    //注入摇号服务
    private DrawHouseService houseService = new DrawHouseService();

    @Override
    public LotteryResult lottery(String uId) {
        //摇号
        String result = houseService.lots(uId);

        return new LotteryResult(uId,result,new Date());
    }
}