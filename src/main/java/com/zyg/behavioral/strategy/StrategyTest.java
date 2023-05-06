package com.zyg.behavioral.strategy;

/**
 * @Author: zyg
 * @Date: 2023/5/6 11:13
 * @Version: v1.0
 * @Description: 策略模式测试类
 */
public class StrategyTest {
    public static void main(String[] args) {
        NormalCustomer normalCustomer = new NormalCustomer();
        VipCustomer vipCustomer = new VipCustomer();
        VVipCustomer vVipCustomer = new VVipCustomer();

        PriceCalculator priceCalculator = new PriceCalculator(vipCustomer);
        Double price = priceCalculator.calculate(100D);
        System.out.println("VIP顾客的折扣价格是"+price+"元");
    }
}
