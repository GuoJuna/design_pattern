package com.afp;

import com.afp.iface.Shape;

/**
 * 创建一个矩形实现类
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("我是一个矩形");
    }
}
