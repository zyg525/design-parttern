package com.zyg.creational.factorymethod.factory;

import com.zyg.creational.factorymethod.product.Product;
import com.zyg.creational.factorymethod.product.ProductA;
import com.zyg.creational.factorymethod.product.ProductB;

/**
 * @Author: zyg
 * @Date: 2023/5/5 15:33
 * @Version: v1.0
 * @Description: 产品A和产品B的工厂实现类
 */
public class FactoryImpl implements Factory {
    @Override
    public Product createProduct(String type) {
        if(type.equals("A")) {
            ProductA productA = new ProductA();
            productA.setId(1);
            productA.setName("产品A");
            return productA;
        }else if(type.equals("B")) {
            ProductB productB = new ProductB();
            productB.setId(1);
            productB.setName("产品B");
            return productB;
        }else {
            throw new RuntimeException("未知类型");
        }
    }
}
