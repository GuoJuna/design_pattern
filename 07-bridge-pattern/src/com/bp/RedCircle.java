package com.bp;

import com.bp.iface.DrawAPI;

/**
 * @author GuoJun
 * @desc 红色圈
 * @since 2022/5/5 20:25
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("制作红色圆[半径:+" + radius + "+ x:"+x+" y:"+y+"]");
    }
}
