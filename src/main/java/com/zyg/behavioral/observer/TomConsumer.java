package com.zyg.behavioral.observer;

/**
 * @Author: zyg
 * @Date: 2023/5/6 10:55
 * @Version: v1.0
 * @Description: 消费者Tom
 */
public class TomConsumer implements Consumer {
    @Override
    public void getPrice(Double price) {
        System.out.println("Tom，最新的商品价格是"+price+"元");
    }
}
