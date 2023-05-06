package com.zyg.structural.decorator;

/**
 * @Author: zyg
 * @Date: 2023/5/6 8:22
 * @Version: v1.0
 * @Description: 裙子装饰类
 */
public class SkirtDecorator extends DressDecorator {
    public SkirtDecorator(BeautifulGirl beautifulGirl) {
        super(beautifulGirl);
    }

    @Override
    public void dress() {
        super.dress();
        System.out.println("下半身穿的裙子");
    }
}
