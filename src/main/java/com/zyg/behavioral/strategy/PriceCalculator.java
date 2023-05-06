package com.zyg.behavioral.strategy;

/**
 * @Author: zyg
 * @Date: 2023/5/6 11:15
 * @Version: v1.0
 * @Description: 价格计算器
 */
public class PriceCalculator {
    Customer customer;

    public PriceCalculator(Customer customer) {
        this.customer = customer;
    }

    public Double calculate(Double price) {
        return customer.getFinalPrice(price);
    }
}
