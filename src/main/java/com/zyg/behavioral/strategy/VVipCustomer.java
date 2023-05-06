package com.zyg.behavioral.strategy;

/**
 * @Author: zyg
 * @Date: 2023/5/6 11:12
 * @Version: v1.0
 * @Description: VVIP顾客
 */
public class VVipCustomer implements Customer {
    @Override
    public Double getFinalPrice(Double price) {
        return price*0.8;
    }
}
