package com.zyg.creational.staticfactory.factory;

import com.zyg.creational.staticfactory.product.Product;
import com.zyg.creational.staticfactory.product.ProductA;
import com.zyg.creational.staticfactory.product.ProductB;

/**
 * @Author: zyg
 * @Date: 2023/5/5 12:14
 * @Version: v1.0
 * @Description: 静态工厂类
 */
public class StaticFactory {
    /**
     * 1、通过传入类型参数来确定创建哪种产品
     * @param type
     * @return
     */
    public static Product createProductByType(String type) {
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

    /**
     * 2、创建产品A
     * @return
     */
    public static Product createProductA() {
        ProductA productA = new ProductA();
        productA.setId(1);
        productA.setName("产品A");
        return productA;
    }

    /**
     * 3、创建产品B
     * @return
     */
    public static Product createProductB() {
        ProductB productB = new ProductB();
        productB.setId(1);
        productB.setName("产品B");
        return productB;
    }
}
