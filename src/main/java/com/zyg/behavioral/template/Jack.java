package com.zyg.behavioral.template;

/**
 * @Author: zyg
 * @Date: 2023/5/6 12:41
 * @Version: v1.0
 * @Description: Jack
 */
public class Jack extends Student {
    @Override
    void study() {
        System.out.println("Jack学习数学");
    }

    @Override
    void raise() {
        System.out.println("Jack打篮球");
    }
}
