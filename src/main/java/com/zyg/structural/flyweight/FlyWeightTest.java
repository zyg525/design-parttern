package com.zyg.structural.flyweight;

/**
 * @Author: zyg
 * @Date: 2023/5/6 9:07
 * @Version: v1.0
 * @Description: 享元模式测试类
 */
public class FlyWeightTest {
    public static void main(String[] args) {
        Chess chess1 = ChessFactory.getChess(Color.WHITE);
        Chess chess2 = ChessFactory.getChess(Color.WHITE);
        Chess chess3 = ChessFactory.getChess(Color.BLACK);
        Chess chess4 = ChessFactory.getChess(Color.BLACK);
        chess1.draw(1,2);
        System.out.println(chess1==chess2);
        System.out.println(chess3==chess4);
    }
}
