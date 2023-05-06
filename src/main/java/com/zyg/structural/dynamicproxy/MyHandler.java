package com.zyg.structural.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: zyg
 * @Date: 2023/5/6 9:30
 * @Version: v1.0
 * @Description: .
 */
public class MyHandler implements InvocationHandler {
    private Object target;

    public MyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(target,args);
        System.out.println("外卖员帮顾客送外卖");
        return null;
    }
}
