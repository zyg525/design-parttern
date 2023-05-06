package com.zyg.behavioral.template;

/**
 * @Author: zyg
 * @Date: 2023/5/6 12:38
 * @Version: v1.0
 * @Description: 学生抽象类-模板类
 */
public abstract class Student {
    public final void doWork() {
        getUp();
        wash();
        study();
        raise();
    }

    private void getUp() {
        System.out.println("起床");
    }

    private void wash() {
        System.out.println("洗漱");
    }

    abstract void study();

    void raise() {}
}
