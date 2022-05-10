package com.fp;

import com.fp.iface.Shape;

/**
 * @author GuoJun
 * @desc 正方形
 * @since 2022/5/10 19:31
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("制作正方形");
    }
}
