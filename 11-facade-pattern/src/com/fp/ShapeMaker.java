package com.fp;

import com.fp.iface.Shape;

/**
 * @author GuoJun
 * @desc 外观类
 * @since 2022/5/10 19:30
 */
public class ShapeMaker {

    private Shape circle;

    private Shape rectangle;

    private Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
