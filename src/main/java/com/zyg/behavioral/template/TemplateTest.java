package com.zyg.behavioral.template;

/**
 * @Author: zyg
 * @Date: 2023/5/6 12:46
 * @Version: v1.0
 * @Description: 模板方法测试类
 */
public class TemplateTest {
    public static void main(String[] args) {
        Student jack = new Jack();
        Student rose = new Rose();

        jack.doWork();

        rose.doWork();
    }
}
