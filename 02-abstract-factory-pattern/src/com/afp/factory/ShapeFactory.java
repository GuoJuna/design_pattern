package com.afp.factory;

import com.afp.Circle;
import com.afp.Rectangle;
import com.afp.Square;
import com.afp.iface.Color;
import com.afp.iface.Shape;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("圆形")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("长方形")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("正方形")){
            return new Square();
        }
        return null;
    }
}
