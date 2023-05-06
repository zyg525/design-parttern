package com.zyg.creational.abstractfactory.product;

/**
 * @Author: zyg
 * @Date: 2023/5/5 16:02
 * @Version: v1.0
 * @Description: 华为电脑
 */
public class HuaweiComputer implements Computer {
    @Override
    public void playGame() {
        System.out.println("用华为电脑打游戏");
    }
}
