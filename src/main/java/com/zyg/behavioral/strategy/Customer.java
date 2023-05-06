package com.zyg.behavioral.strategy;

/**
 * @Author: zyg
 * @Date: 2023/5/6 11:10
 * @Version: v1.0
 * @Description: 顾客接口
 */
public interface Customer {
    Double getFinalPrice(Double price);
}
