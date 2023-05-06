package com.zyg.behavioral.observer;

/**
 * @Author: zyg
 * @Date: 2023/5/6 11:01
 * @Version: v1.0
 * @Description: 观察者模式测试类
 */
public class ObserverTest {
    public static void main(String[] args) {
        JackConsumer jackConsumer = new JackConsumer();
        TomConsumer tomConsumer = new TomConsumer();

        Store store = new StoreImpl();
        store.add(jackConsumer);
        store.add(tomConsumer);
        store.notifyPrice(100D);

        store.remove(jackConsumer);
        store.notifyPrice(200D);
    }
}
