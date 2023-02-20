package com.jiowangh.chain;

import com.alibaba.fastjson.JSON;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangjiong
 * @create 2023/2/20 20:51
 */
public class Client {



    public static void main(String[] args) throws ParseException {

        Logger logger = LoggerFactory.getLogger(Client.class);

        AuthLink authLink = new Level3AuthLink("1000013", "王工")
                .appendNext(new Level2AuthLink("1000012", "张经理")
                        .appendNext(new Level1AuthLink("1000011", "段总")));

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate = f.parse("2020-11-18 23:49:46");

        logger.debug("测试结果：{}", JSON.toJSONString(authLink.doAuth("研发牛马", "1000998004813441", currentDate)));
        // 模拟三级负责人审批
        AuthService.auth("1000013", "1000998004813441");
        logger.debug("测试结果：{}", "模拟三级负责人审批，王工");
        logger.debug("测试结果：{}", JSON.toJSONString(authLink.doAuth("研发牛马", "1000998004813441", currentDate)));

        // 模拟二级负责人审批
        AuthService.auth("1000012", "1000998004813441");
        logger.debug("测试结果：{}", "模拟二级负责人审批，张经理");
        logger.debug("测试结果：{}", JSON.toJSONString(authLink.doAuth("研发牛马", "1000998004813441", currentDate)));

        // 模拟一级负责人审批
        AuthService.auth("1000011", "1000998004813441");
        logger.debug("测试结果：{}", "模拟一级负责人审批，段总");
        logger.debug("测试结果：{}", JSON.toJSONString(authLink.doAuth("研发牛马", "1000998004813441", currentDate)));
    }
}
