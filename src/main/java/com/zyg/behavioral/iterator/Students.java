package com.zyg.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: zyg
 * @Date: 2023/5/6 10:16
 * @Version: v1.0
 * @Description: 学生集合类
 */
public class Students implements Iterable<Student> {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    private class Itr implements Iterator<Student> {
        int index = 0;

        @Override
        public boolean hasNext() {
            if(index < students.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Student next() {
            Student student = students.get(index);
            index++;
            return student;
        }
    }

    @Override
    public Iterator<Student> iterator() {
        return new Itr();
    }
}
