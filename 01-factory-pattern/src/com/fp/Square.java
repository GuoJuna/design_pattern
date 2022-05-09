package com.fp;

import com.fp.iface.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("我是一个正方形");
    }
}
