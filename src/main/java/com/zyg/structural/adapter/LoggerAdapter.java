package com.zyg.structural.adapter;

/**
 * @Author: zyg
 * @Date: 2023/5/5 19:48
 * @Version: v1.0
 * @Description: 日志适配器-将第三方日志接入到系统日志
 */
public class LoggerAdapter implements SystemLogger {
    OtherLogger otherLogger;

    public LoggerAdapter(OtherLogger otherLogger) {
        this.otherLogger = otherLogger;
    }

    @Override
    public void log() {
        otherLogger.logs();
    }
}
