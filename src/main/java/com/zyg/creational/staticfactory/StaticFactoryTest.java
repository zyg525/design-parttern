package com.zyg.creational.staticfactory;

import com.zyg.creational.staticfactory.factory.StaticFactory;
import com.zyg.creational.staticfactory.product.Product;

/**
 * @Author: zyg
 * @Date: 2023/5/5 12:19
 * @Version: v1.0
 * @Description: 静态工厂测试类
 */
public class StaticFactoryTest {
    public static void main(String[] args) {
        /**
         * 1、既可以通过传入类型参数来决定创建哪种产品
         */
        Product product = StaticFactory.createProductByType("A");
        product.useProduct();

        /**
         * 2、也可以将不同产品的创建过程放在不同的方法中
         */
        Product productA = StaticFactory.createProductA();
        productA.useProduct();
    }
}
