package com.zyg.structural.flyweight;

/**
 * @Author: zyg
 * @Date: 2023/5/6 9:00
 * @Version: v1.0
 * @Description: 黑色棋子
 */
public class BlackChess implements Chess {
    private Color color = Color.BLACK;

    @Override
    public void draw(int x, int y) {
        System.out.println("黑色棋子横坐标:"+x+" 纵坐标:"+y);
    }
}
