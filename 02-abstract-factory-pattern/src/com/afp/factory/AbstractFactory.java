package com.afp.factory;

import com.afp.iface.Color;
import com.afp.iface.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
