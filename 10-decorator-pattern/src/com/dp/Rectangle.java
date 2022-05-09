package com.dp;

import com.dp.iface.Shape;

/**
 * @author GuoJun
 * @desc 长方形
 * @since 2022/5/9 18:40
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("制作长方形");
    }
}
