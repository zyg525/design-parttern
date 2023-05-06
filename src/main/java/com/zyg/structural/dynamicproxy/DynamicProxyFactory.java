package com.zyg.structural.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @Author: zyg
 * @Date: 2023/5/6 9:29
 * @Version: v1.0
 * @Description: 动态代理工厂
 */
public class DynamicProxyFactory {
    public static Object getProxy(Object target) {
        MyHandler myHandler = new MyHandler(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                                      target.getClass().getInterfaces(),
                                      myHandler);
    }
}
