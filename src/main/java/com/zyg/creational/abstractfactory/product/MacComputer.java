package com.zyg.creational.abstractfactory.product;

/**
 * @Author: zyg
 * @Date: 2023/5/5 16:04
 * @Version: v1.0
 * @Description: 苹果电脑
 */
public class MacComputer implements Computer {
    @Override
    public void playGame() {
        System.out.println("用苹果电脑打游戏");
    }
}
