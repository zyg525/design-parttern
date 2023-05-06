package com.zyg.structural.adapter;

/**
 * @Author: zyg
 * @Date: 2023/5/5 19:48
 * @Version: v1.0
 * @Description: 第三方日志实现类
 */
public class OtherLoggerImpl implements OtherLogger {
    @Override
    public void logs() {
        System.out.println("第三方日志");
    }
}
