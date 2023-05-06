package com.zyg.structural.adapter;

/**
 * @Author: zyg
 * @Date: 2023/5/5 19:46
 * @Version: v1.0
 * @Description: 系统日志实现类
 */
public class SystemLoggerImpl implements SystemLogger {
    @Override
    public void log() {
        System.out.println("系统日志");
    }
}
