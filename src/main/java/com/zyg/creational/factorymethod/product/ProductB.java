package com.zyg.creational.factorymethod.product;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: zyg
 * @Date: 2023/5/5 12:13
 * @Version: v1.0
 * @Description: 产品实现类A
 */
@Data
@Slf4j
public class ProductB implements Product {
    private Integer id;
    private String name;

    @Override
    public void useProduct() {
        log.info("使用产品B，产品id是:{} 产品名字是:{}",id,name);
    }
}
