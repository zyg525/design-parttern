package com.zyg.creational.budiler;

import java.util.Date;

/**
 * @Author: zyg
 * @Date: 2023/5/5 16:32
 * @Version: v1.0
 * @Description: 学生类
 */
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Double score;
    private Date birthday;

    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.score = builder.score;
        this.birthday = builder.birthday;
    }

    public static class Builder {
        private Integer id;
        private String name;
        private Integer age;
        private Double score;
        private Date birthday;

        public Builder(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setScore(Double score) {
            this.score = score;
            return this;
        }

        public Builder setBirthday(Date birthday) {
            this.birthday = birthday;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", birthday=" + birthday +
                '}';
    }
}
