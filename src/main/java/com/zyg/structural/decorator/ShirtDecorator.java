package com.zyg.structural.decorator;

/**
 * @Author: zyg
 * @Date: 2023/5/6 8:19
 * @Version: v1.0
 * @Description: 短袖装饰类
 */
public class ShirtDecorator extends DressDecorator{
    public ShirtDecorator(BeautifulGirl beautifulGirl) {
        super(beautifulGirl);
    }

    @Override
    public void dress() {
        super.dress();
        System.out.println("她上半身穿的短袖");
    }
}
