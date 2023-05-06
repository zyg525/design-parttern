package com.zyg.creational.singleton;

/**
 * @Author: zyg
 * @Date: 2023/5/5 17:40
 * @Version: v1.0
 * @Description: 单例模式-饿汉式写法
 */
public class SingletonHungry {
    private static SingletonHungry singletonHungry = new SingletonHungry();

    private SingletonHungry() {}

    public static SingletonHungry getSingletonHungry() {
        return singletonHungry;
    }
}
