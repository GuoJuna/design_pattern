package com.afp;

import com.afp.iface.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("绿色");
    }
}
