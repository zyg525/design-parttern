package com.zyg.structural.decorator;

/**
 * @Author: zyg
 * @Date: 2023/5/6 8:24
 * @Version: v1.0
 * @Description: 装饰者模式测试类
 */
public class DecoratorTest {
    public static void main(String[] args) {
        BeautifulGirl girl = new HighHeels(new SkirtDecorator(new ShirtDecorator(new Rose())));
        girl.dress();
    }
}
