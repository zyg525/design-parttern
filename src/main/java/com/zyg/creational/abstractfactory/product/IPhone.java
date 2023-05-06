package com.zyg.creational.abstractfactory.product;

/**
 * @Author: zyg
 * @Date: 2023/5/5 16:03
 * @Version: v1.0
 * @Description: 苹果手机
 */
public class IPhone implements MobilePhone {
    @Override
    public void call() {
        System.out.println("用苹果手机打电话");
    }
}
