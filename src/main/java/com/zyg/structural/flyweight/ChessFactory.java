package com.zyg.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zyg
 * @Date: 2023/5/6 9:03
 * @Version: v1.0
 * @Description: 棋子工厂类
 */
public class ChessFactory {
    private static Map<Color,Chess> map = new HashMap();

    public static Chess getChess(Color color) {
        Chess chess = map.get(color);
        if(chess == null) {
            chess = color==Color.BLACK ? new BlackChess():new WhiteChess();
            map.put(color,chess);
        }
        return chess;
    }
}
