package com.zyg.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zyg
 * @Date: 2023/5/5 19:31
 * @Version: v1.0
 * @Description: 学生类
 */
public class Student {
    private Integer id;
    private String name;
    private List<String> workQueue;

    public Student() {
        workQueue = new ArrayList<>();
    }

    public Student(List<String> workQueue) {
        this.workQueue = workQueue;
    }

    public void preWork() {
        workQueue.add("起床");
        workQueue.add("刷牙");
        workQueue.add("洗脸");
    }

    public List<String> getWorkQueue() {
        return workQueue;
    }

    public Student copy() {
        List<String> list = new ArrayList<>(workQueue);
        return new Student(list);
    }
}
