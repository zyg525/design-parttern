package com.zyg.creational.abstractfactory;

import com.zyg.creational.abstractfactory.factory.Factory;
import com.zyg.creational.abstractfactory.factory.HuaweiFactory;
import com.zyg.creational.abstractfactory.product.Computer;
import com.zyg.creational.abstractfactory.product.MobilePhone;

/**
 * @Author: zyg
 * @Date: 2023/5/5 16:10
 * @Version: v1.0
 * @Description: 抽象工厂测试类
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        /**
         * 创建华为工厂
         */
        Factory huaweiFactory = new HuaweiFactory();
        Computer computer = huaweiFactory.createComputer();
        MobilePhone mobilePhone = huaweiFactory.createMobilePhone();
        computer.playGame();
        mobilePhone.call();
    }
}
