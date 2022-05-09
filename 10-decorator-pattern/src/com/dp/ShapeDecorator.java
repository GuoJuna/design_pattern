package com.dp;

import com.dp.iface.Shape;

/**
 * @author GuoJun
 * @desc 抽象装饰类
 * @since 2022/5/9 18:42
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
