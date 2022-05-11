package com.fp;

import com.fp.iface.Shape;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/11 20:54
 */
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("制作圆形 [Color : " + color + ", x : " + x + ", y : " + y + ", 半径: " + radius + "]");
    }
}
