package com.bp;

import com.bp.stract.Burger;

/**
 * 蔬菜汉堡
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
