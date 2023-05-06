package com.zyg.creational.singleton;

/**
 * @Author: zyg
 * @Date: 2023/5/5 17:53
 * @Version: v1.0
 * @Description: 单例模式-双重检验锁写法
 */
public class SingletonDoubleCheck {
    private static volatile SingletonDoubleCheck singletonDoubleCheck;

    private SingletonDoubleCheck() {
    }

    public static SingletonDoubleCheck getSingletonDoubleCheck() {
        if(singletonDoubleCheck == null) {
            synchronized (SingletonDoubleCheck.class) {
                if(singletonDoubleCheck == null) {
                    singletonDoubleCheck = new SingletonDoubleCheck();
                }
            }
        }
        return singletonDoubleCheck;
    }
}
