package com.zyg.creational.factorymethod.factory;

import com.zyg.creational.factorymethod.product.Product;
import com.zyg.creational.factorymethod.product.ProductC;

/**
 * @Author: zyg
 * @Date: 2023/5/5 15:45
 * @Version: v1.0
 * @Description: 新增产品C的工厂实现类
 */
public class FactoryCImpl implements Factory {
    @Override
    public Product createProduct(String type) {
        if(type.equals("C")) {
            ProductC productC = new ProductC();
            productC.setId(1);
            productC.setName("产品C");
            return productC;
        }else {
            throw new RuntimeException("未知类型");
        }
    }
}
