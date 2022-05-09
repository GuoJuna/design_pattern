package com.pa;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author GuoJun
 * @desc 形状数据类
 * @since 2022/4/28 19:33
 */
public class ShapeCache {

    private static ConcurrentHashMap<String, Shape> shapeMap = new ConcurrentHashMap<>();

    public static Shape getShape(String shapeId){
        Shape shape = shapeMap.get(shapeId);
        return (Shape) shape.clone();
    }

    //初始化加载3种形状
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
