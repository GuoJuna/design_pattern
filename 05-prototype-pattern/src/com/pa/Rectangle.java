package com.pa;

/**
 * @author GuoJun
 * @desc 长方形
 * @since 2022/4/28 19:28
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "长方形";
    }

    @Override
    void draw() {
        System.out.println(type + " 绘制成功!!!");
    }

}
