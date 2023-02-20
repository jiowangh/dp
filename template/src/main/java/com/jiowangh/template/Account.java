package com.jiowangh.template;

/**
 * @author wangjiong
 * @create 2023/2/20 20:18
 */
public abstract class Account {

    //step1 具体方法-验证用户信息是否正确
    public boolean validate(String account,String password){
        System.out.println("账号: " + account + ",密码: " + password);
        if(account.equalsIgnoreCase("tom") &&
                password.equalsIgnoreCase("123456")){
            return true;
        }else{
            return false;
        }
    }

    //step2 抽象方法-计算利息
    public abstract void calculate();

    //step3 具体方法-显示利息
    public abstract void display();

    //模板方法
    public void handle(String account,String password){
        if(!validate(account,password)){
            System.out.println("账户或密码错误!!");
            return;
        }
        calculate();
        display();
    }
}