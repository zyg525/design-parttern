package com.zyg.structural.facade;

/**
 * @Author: zyg
 * @Date: 2023/5/6 8:46
 * @Version: v1.0
 * @Description: 电商外观类
 */
public class ECommerceFacade {
    void buy() {
        new Product().order();
        new Finance().pay();
        new Express().send();
    }
}
