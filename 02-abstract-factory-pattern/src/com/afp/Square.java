package com.afp;

import com.afp.iface.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("我是一个正方形");
    }
}
