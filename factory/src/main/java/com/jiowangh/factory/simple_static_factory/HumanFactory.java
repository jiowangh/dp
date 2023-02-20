package com.jiowangh.factory.simple_static_factory;

/**
 * @author wangjiong
 * @create 2023/2/20 10:57
 */
public class HumanFactory {
    public static /* 添加静态方法能直接调用 */ <T extends Human> T createHuman(Class<T> c){
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}
