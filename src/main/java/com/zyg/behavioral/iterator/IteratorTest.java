package com.zyg.behavioral.iterator;

import java.util.Iterator;

/**
 * @Author: zyg
 * @Date: 2023/5/6 10:23
 * @Version: v1.0
 * @Description: 迭代器模式测试类
 */
public class IteratorTest {
    public static void main(String[] args) {
        Students students = new Students();
        students.addStudent(new Student(1,"张三"));
        students.addStudent(new Student(2,"李四"));
        students.addStudent(new Student(3,"王五"));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
