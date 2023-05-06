package com.zyg.creational.factorymethod.factory;

import com.zyg.creational.factorymethod.product.Product;

/**
 * @Author: zyg
 * @Date: 2023/5/5 15:32
 * @Version: v1.0
 * @Description: 工厂接口
 */
public interface Factory {
    Product createProduct(String type);
}
