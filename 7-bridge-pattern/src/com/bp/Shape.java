package com.bp;

import com.bp.iface.DrawAPI;

/**
 * @author GuoJun
 * @desc 形状
 * @since 2022/5/5 20:35
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
