package com.zyg.structural.facade;

/**
 * @Author: zyg
 * @Date: 2023/5/6 8:48
 * @Version: v1.0
 * @Description: 外观模式测试类
 */
public class FacadeTest {
    public static void main(String[] args) {
        new ECommerceFacade().buy();
    }
}
