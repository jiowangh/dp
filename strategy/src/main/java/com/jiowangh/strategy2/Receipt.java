package com.jiowangh.strategy2;

/**
 * @author wangjiong
 * @create 2023/2/20 20:35
 */
public class Receipt {

    private String message; //回执信息

    private String type; //回执类型(MT1101、MT2101、MT4101、MT8104)

    public Receipt() {
    }

    public Receipt(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}