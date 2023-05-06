package com.zyg.structural.decorator;

/**
 * @Author: zyg
 * @Date: 2023/5/6 8:17
 * @Version: v1.0
 * @Description: 衣服装饰类
 */
public abstract class DressDecorator implements BeautifulGirl {
    BeautifulGirl beautifulGirl;

    public DressDecorator(BeautifulGirl beautifulGirl) {
        this.beautifulGirl = beautifulGirl;
    }

    @Override
    public void dress() {
        beautifulGirl.dress();
    }
}
