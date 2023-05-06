package com.zyg.structural.adapter;

/**
 * @Author: zyg
 * @Date: 2023/5/5 19:51
 * @Version: v1.0
 * @Description: 适配器模式测试类
 */
public class AdapterTest {
    public static void main(String[] args) {
        /**
         * 将第三方日志转换为了系统日志
         */
        SystemLogger logger = new LoggerAdapter(new OtherLoggerImpl());
        logger.log();
    }
}
