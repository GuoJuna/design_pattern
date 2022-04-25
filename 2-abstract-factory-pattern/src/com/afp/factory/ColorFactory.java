package com.afp.factory;

import com.afp.Blue;
import com.afp.Green;
import com.afp.Red;
import com.afp.Square;
import com.afp.iface.Color;
import com.afp.iface.Shape;

public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("红色")){
            return new Red();
        }else if(color.equalsIgnoreCase("绿色")){
            return new Green();
        }else if(color.equalsIgnoreCase("蓝色")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
