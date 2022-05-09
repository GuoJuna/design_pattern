package com.pa;

/**
 * @author GuoJun
 * @desc 圆形
 * @since 2022/4/28 19:32
 */
public class Circle extends Shape{
    public Circle(){
        type = "圆形";
    }

    @Override
    void draw() {
        System.out.println(type + " 绘制成功!!!");
    }
}
