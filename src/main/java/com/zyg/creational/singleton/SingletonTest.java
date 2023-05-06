package com.zyg.creational.singleton;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: zyg
 * @Date: 2023/5/5 17:42
 * @Version: v1.0
 * @Description: 单例模式测试类
 */
public class SingletonTest {
    public static void main(String[] args) throws Exception {
        /**
         * 测试饿汉式写法
         */
        SingletonHungry singletonHungry = SingletonHungry.getSingletonHungry();
        ArrayList<Future> list1 = new ArrayList<>();
        ThreadPoolExecutor executor1 = new ThreadPoolExecutor(100, 200, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000));
        for(int i=0;i<100;i++) {
            Future<?> future = executor1.submit(() -> {
                SingletonHungry singleton = SingletonHungry.getSingletonHungry();
                if (singleton != singletonHungry) {
                    throw new RuntimeException("非单例");
                }
            });
            list1.add(future);
        }
        for(Future future:list1) {
            future.get();
        }
        System.out.println("end");

        /**
         * 测试双重检验锁写法
         */
        SingletonDoubleCheck singletonDoubleCheck = SingletonDoubleCheck.getSingletonDoubleCheck();
        ArrayList<Future> list2 = new ArrayList<>();
        ThreadPoolExecutor executor2 = new ThreadPoolExecutor(100, 200, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000));
        for(int i=0;i<100;i++) {
            Future<?> future = executor2.submit(() -> {
                SingletonDoubleCheck singleton = SingletonDoubleCheck.getSingletonDoubleCheck();
                if (singleton != singletonDoubleCheck) {
                    throw new RuntimeException("非单例");
                }
            });
            list2.add(future);
        }
        for(Future future:list2) {
            future.get();
        }
        System.out.println("end");

        /**
         * 测试静态内部类写法
         */
        SingletonInnerClass singletonInnerClass = SingletonInnerClass.getSingletonInnerClass();
        ArrayList<Future> list3 = new ArrayList<>();
        ThreadPoolExecutor executor3 = new ThreadPoolExecutor(100, 200, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000));
        for(int i=0;i<100;i++) {
            Future<?> future = executor3.submit(() -> {
                SingletonInnerClass singleton = SingletonInnerClass.getSingletonInnerClass();
                if (singleton != singletonInnerClass) {
                    throw new RuntimeException("非单例");
                }
            });
            list3.add(future);
        }
        for(Future future:list3) {
            future.get();
        }
        System.out.println("end");

        /**
         * 测试枚举类写法
         */
        SingletonEnum singletonEnum = SingletonEnum.single;
        ArrayList<Future> list4 = new ArrayList<>();
        ThreadPoolExecutor executor4 = new ThreadPoolExecutor(100, 200, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000));
        for(int i=0;i<100;i++) {
            Future<?> future = executor4.submit(() -> {
                SingletonEnum singleton = SingletonEnum.single;
                if (singleton != singletonEnum) {
                    throw new RuntimeException("非单例");
                }
            });
            list4.add(future);
        }
        for(Future future:list4) {
            future.get();
        }
        System.out.println("end");
    }
}
