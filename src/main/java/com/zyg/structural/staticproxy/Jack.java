package com.zyg.structural.staticproxy;

/**
 * @Author: zyg
 * @Date: 2023/5/6 9:15
 * @Version: v1.0
 * @Description: 杰克-被代理类
 */
public class Jack implements Customer {
    @Override
    public void orderFood() {
        System.out.println("杰克点外卖");
    }
}
