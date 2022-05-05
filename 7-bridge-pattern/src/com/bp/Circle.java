package com.bp;

import com.bp.iface.DrawAPI;

/**
 * @author GuoJun
 * @desc 圆形
 * @since 2022/5/5 20:36
 */
public class Circle extends Shape{

    private int x, y, radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
