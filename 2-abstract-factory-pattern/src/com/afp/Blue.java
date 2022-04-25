package com.afp;

import com.afp.iface.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("蓝色");
    }
}
