package com.jiowangh.factory.factorymethod;

/**
 * @author wangjiong
 * @create 2023/2/20 10:57
 */
public class HumanFactory extends AbstractHumanFactory{

    @Override
    public /* 添加静态方法能直接调用 */ <T extends Human> T createHuman(Class<T> c){
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}
