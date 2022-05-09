package com.dp;

import com.dp.iface.Shape;

/**
 * @author GuoJun
 * @desc 原型
 * @since 2022/5/9 18:41
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("制作圆形");
    }
}
