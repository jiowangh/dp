package com.jiowangh.chain;

/**
 * @author wangjiong
 * @create 2023/2/20 20:48
 */
public class AuthInfo {

    private String code;

    private String info ="";

    public AuthInfo(String code, String... infos) {
        this.code = code;
        for (String str : infos) {
            info = this.info.concat(str +" ");
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "AuthInfo{" +
                "code='" + code + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
