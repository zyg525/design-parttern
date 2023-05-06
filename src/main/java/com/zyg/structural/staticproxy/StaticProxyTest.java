package com.zyg.structural.staticproxy;

/**
 * @Author: zyg
 * @Date: 2023/5/6 9:18
 * @Version: v1.0
 * @Description: 静态代理测试类
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Customer proxy = StaticProxyFactory.getProxy();
        proxy.orderFood();
    }
}
