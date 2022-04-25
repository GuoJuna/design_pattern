package com.afp;

import com.afp.iface.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("红色");
    }
}
