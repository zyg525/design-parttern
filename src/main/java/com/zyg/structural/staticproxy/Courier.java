package com.zyg.structural.staticproxy;

/**
 * @Author: zyg
 * @Date: 2023/5/6 9:17
 * @Version: v1.0
 * @Description: 外卖员-代理类
 */
public class Courier implements Customer {
    Customer customer;

    public Courier(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void orderFood() {
        customer.orderFood();
        System.out.println("外卖员帮顾客送外卖");
    }
}
