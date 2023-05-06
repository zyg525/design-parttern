package com.zyg.behavioral.observer;

/**
 * @Author: zyg
 * @Date: 2023/5/6 10:57
 * @Version: v1.0
 * @Description: 商店接口
 */
public interface Store {
    void add(Consumer consumer);

    void remove(Consumer consumer);

    void notifyPrice(Double price);
}
