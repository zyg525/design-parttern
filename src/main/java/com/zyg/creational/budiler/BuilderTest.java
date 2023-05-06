package com.zyg.creational.budiler;

import java.util.Date;

/**
 * @Author: zyg
 * @Date: 2023/5/5 16:37
 * @Version: v1.0
 * @Description: 建造者模式测试类
 */
public class BuilderTest {
    public static void main(String[] args) {
        Student student = new Student.Builder(1, "张三")
                .setAge(18)
                .setScore(99.5)
                .setBirthday(new Date())
                .build();
        System.out.println(student);
    }
}
