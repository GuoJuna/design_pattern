package com.fp;

import com.fp.iface.Shape;

/**
 * @author GuoJun
 * @desc 长方形
 * @since 2022/5/10 19:29
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("制作长方形");
    }
}
