package com.zyg.structural.staticproxy;

/**
 * @Author: zyg
 * @Date: 2023/5/6 9:19
 * @Version: v1.0
 * @Description: 静态代理工厂
 */
public class StaticProxyFactory {
    /**
     * 代理关系在编译期已经确定
     * @return
     */
    public static Customer getProxy() {
        return new Courier(new Jack());
    }
}
