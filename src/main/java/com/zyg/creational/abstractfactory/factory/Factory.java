package com.zyg.creational.abstractfactory.factory;

import com.zyg.creational.abstractfactory.product.Computer;
import com.zyg.creational.abstractfactory.product.MobilePhone;

/**
 * @Author: zyg
 * @Date: 2023/5/5 16:07
 * @Version: v1.0
 * @Description: 工厂接口
 */
public interface Factory {
    Computer createComputer();
    MobilePhone createMobilePhone();
}
