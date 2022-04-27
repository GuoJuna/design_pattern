package com.bp;

import com.bp.stract.ColdDrink;

/**
 * @author GuoJun
 * @desc 可乐
 * @since 2022/4/27 19:17
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可乐";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
