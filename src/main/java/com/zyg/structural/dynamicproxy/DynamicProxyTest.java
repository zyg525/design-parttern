package com.zyg.structural.dynamicproxy;

/**
 * @Author: zyg
 * @Date: 2023/5/6 9:35
 * @Version: v1.0
 * @Description: JDK动态代理测试类
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Customer proxy = (Customer) DynamicProxyFactory.getProxy(new Jack());
        proxy.orderFood();
    }
}
