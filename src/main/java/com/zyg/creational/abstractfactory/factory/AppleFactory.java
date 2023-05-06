package com.zyg.creational.abstractfactory.factory;

import com.zyg.creational.abstractfactory.product.Computer;
import com.zyg.creational.abstractfactory.product.IPhone;
import com.zyg.creational.abstractfactory.product.MacComputer;
import com.zyg.creational.abstractfactory.product.MobilePhone;

/**
 * @Author: zyg
 * @Date: 2023/5/5 16:08
 * @Version: v1.0
 * @Description: 苹果工厂
 */
public class AppleFactory implements Factory {
    @Override
    public Computer createComputer() {
        return new MacComputer();
    }

    @Override
    public MobilePhone createMobilePhone() {
        return new IPhone();
    }
}
