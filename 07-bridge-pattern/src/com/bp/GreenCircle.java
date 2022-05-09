package com.bp;

import com.bp.iface.DrawAPI;

/**
 * @author GuoJun
 * @desc 绿圆
 * @since 2022/5/5 20:32
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("制作绿色圆[半径:+" + radius + "+ x:"+x+" y:"+y+"]");
    }
}
