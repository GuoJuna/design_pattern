package com.dp;

import com.dp.iface.Shape;

/**
 * @author GuoJun
 * @desc 红色装饰类
 * @since 2022/5/9 18:44
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("增加红色边框");
    }
}
