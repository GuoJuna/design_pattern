package com.pa;


/**
 * @author GuoJun
 * @desc 正方形
 * @since 2022/4/28 19:30
 */
public class Square extends Shape {
    public Square(){
        type = "正方形";
    }

    @Override
    void draw() {
        System.out.println(type + " 绘制成功!!!");
    }
}
