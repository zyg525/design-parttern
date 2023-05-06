package com.zyg.creational.singleton;

/**
 * @Author: zyg
 * @Date: 2023/5/5 17:58
 * @Version: v1.0
 * @Description: 单例模式-静态内部类写法
 */
public class SingletonInnerClass {

    private SingletonInnerClass() {
    }

    private static class Inner {
        private static SingletonInnerClass singletonInnerClass = new SingletonInnerClass();
    }

    public static SingletonInnerClass getSingletonInnerClass() {
        return Inner.singletonInnerClass;
    }
}
