package com.afp;

import com.afp.iface.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("我是一个圆");
    }
}
