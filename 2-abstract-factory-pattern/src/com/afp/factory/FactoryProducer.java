package com.afp.factory;

/**
 * 工厂生成器
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("形状")){
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("颜色")) {
            return new ColorFactory();
        }
        return null;
    }
}
