package com.zyg.behavioral.strategy;

/**
 * @Author: zyg
 * @Date: 2023/5/6 11:11
 * @Version: v1.0
 * @Description: 普通顾客
 */
public class NormalCustomer implements Customer {
    @Override
    public Double getFinalPrice(Double price) {
        return price;
    }
}
