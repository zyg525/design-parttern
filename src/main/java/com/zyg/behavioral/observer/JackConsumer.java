package com.zyg.behavioral.observer;

/**
 * @Author: zyg
 * @Date: 2023/5/6 10:55
 * @Version: v1.0
 * @Description: 消费者Jack
 */
public class JackConsumer implements Consumer {
    @Override
    public void getPrice(Double price) {
        System.out.println("Jack，最新的商品价格是"+price+"元");
    }
}
