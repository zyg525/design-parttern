package com.zyg.creational.abstractfactory.product;

/**
 * @Author: zyg
 * @Date: 2023/5/5 16:02
 * @Version: v1.0
 * @Description: 华为手机
 */
public class HuaweiMobilePhone implements MobilePhone {
    @Override
    public void call() {
        System.out.println("用华为手机打电话");
    }
}
