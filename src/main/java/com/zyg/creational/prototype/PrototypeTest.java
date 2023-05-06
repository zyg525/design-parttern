package com.zyg.creational.prototype;

import java.util.List;

/**
 * @Author: zyg
 * @Date: 2023/5/5 19:37
 * @Version: v1.0
 * @Description: 原型模式测试类
 */
public class PrototypeTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.preWork();
        /**
         * 在原型对象的基础上进行修改
         */
        Student copyStudent = student.copy();
        List<String> workQueue = copyStudent.getWorkQueue();
        workQueue.add("努力学习");
        for(String work:workQueue) {
            System.out.println(work);
        }
    }
}
