package com.zyg.structural.decorator;

/**
 * @Author: zyg
 * @Date: 2023/5/6 8:24
 * @Version: v1.0
 * @Description: 高跟鞋装饰类
 */
public class HighHeels extends DressDecorator {
    public HighHeels(BeautifulGirl beautifulGirl) {
        super(beautifulGirl);
    }

    @Override
    public void dress() {
        super.dress();
        System.out.println("脚上穿的高跟鞋");
    }
}
