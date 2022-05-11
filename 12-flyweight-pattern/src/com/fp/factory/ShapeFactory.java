package com.fp.factory;

import com.fp.Circle;
import com.fp.iface.Shape;

import java.util.HashMap;

/**
 * @author GuoJun
 * @desc 工厂
 * @since 2022/5/11 20:58
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);

        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("创建" + color + "的圆形");
        }
        return circle;
    }
}
