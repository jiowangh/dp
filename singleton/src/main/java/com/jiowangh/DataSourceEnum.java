package com.jiowangh;

/**
 * @author wangjiong
 * @create 2023/2/20 9:55
 * 枚举的使用
 */
public enum DataSourceEnum {

    USERNAME("root"),
    PASSWORD("123456"),
    URL("127.0.0.1"),
    DRIVER("com.mysql.jdbc.Driver");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    DataSourceEnum(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        System.out.println(DataSourceEnum.USERNAME.getValue());
        System.out.println(DataSourceEnum.PASSWORD.getValue());
        System.out.println(DataSourceEnum.URL.getValue());
        System.out.println(DataSourceEnum.DRIVER.getValue());
    }
}
