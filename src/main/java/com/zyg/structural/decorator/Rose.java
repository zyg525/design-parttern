package com.zyg.structural.decorator;

/**
 * @Author: zyg
 * @Date: 2023/5/6 8:15
 * @Version: v1.0
 * @Description: Rose
 */
public class Rose implements BeautifulGirl {
    @Override
    public void dress() {
        System.out.println("Rose今天穿了一身漂亮的衣服");
    }
}
