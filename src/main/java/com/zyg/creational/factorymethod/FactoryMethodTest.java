package com.zyg.creational.factorymethod;

import com.zyg.creational.factorymethod.factory.Factory;
import com.zyg.creational.factorymethod.factory.FactoryCImpl;
import com.zyg.creational.factorymethod.factory.FactoryImpl;
import com.zyg.creational.factorymethod.product.Product;

/**
 * @Author: zyg
 * @Date: 2023/5/5 15:36
 * @Version: v1.0
 * @Description: 工厂方法测试类
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        /**
         * 创建产品A和产品B的工厂
         */
        Factory factory = new FactoryImpl();
        Product product = factory.createProduct("A");
        product.useProduct();

        /**
         * 创建新增产品C的工厂
         */
        FactoryCImpl factoryC = new FactoryCImpl();
        Product productC = factoryC.createProduct("C");
        productC.useProduct();

    }
}
