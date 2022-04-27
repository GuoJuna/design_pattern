package com.bp;

import com.bp.stract.Burger;

/**
 * @author GuoJun
 * @desc 鸡肉汉堡
 * @since 2022/4/27 19:16
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
