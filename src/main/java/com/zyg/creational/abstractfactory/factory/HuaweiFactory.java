package com.zyg.creational.abstractfactory.factory;

import com.zyg.creational.abstractfactory.product.Computer;
import com.zyg.creational.abstractfactory.product.HuaweiComputer;
import com.zyg.creational.abstractfactory.product.HuaweiMobilePhone;
import com.zyg.creational.abstractfactory.product.MobilePhone;

/**
 * @Author: zyg
 * @Date: 2023/5/5 16:09
 * @Version: v1.0
 * @Description: 华为工厂
 */
public class HuaweiFactory implements Factory {
    @Override
    public Computer createComputer() {
        return new HuaweiComputer();
    }

    @Override
    public MobilePhone createMobilePhone() {
        return new HuaweiMobilePhone();
    }
}
