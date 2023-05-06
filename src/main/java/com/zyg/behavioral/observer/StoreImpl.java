package com.zyg.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zyg
 * @Date: 2023/5/6 10:59
 * @Version: v1.0
 * @Description: 商店实现类
 */
public class StoreImpl implements Store {
    private final List<Consumer> consumers = new ArrayList<>();

    @Override
    public void add(Consumer consumer) {
        consumers.add(consumer);
    }

    @Override
    public void remove(Consumer consumer) {
        consumers.remove(consumer);
    }

    @Override
    public void notifyPrice(Double price) {
        for(Consumer consumer:consumers) {
            consumer.getPrice(price);
        }
    }
}
