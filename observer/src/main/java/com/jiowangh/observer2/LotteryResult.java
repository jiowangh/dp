package com.jiowangh.observer2;

import java.util.Date;

/**
 * @author wangjiong
 * @create 2023/2/20 19:47
 */
public class LotteryResult {
    private String uId; // 用户id
    private String msg; // 摇号信息
    private Date dataTime; // 业务时间

    public LotteryResult(String uId, String msg, Date dataTime) {
        this.uId = uId;
        this.msg = msg;
        this.dataTime = dataTime;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }
}
