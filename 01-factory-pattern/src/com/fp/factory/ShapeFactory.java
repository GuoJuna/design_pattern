package com.fp.factory;

import com.fp.Circle;
import com.fp.Rectangle;
import com.fp.Square;
import com.fp.iface.Shape;

public class ShapeFactory {

    //使用getShape方法获取形状类型的对象
    public Shape getShape(String shapeType){
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
