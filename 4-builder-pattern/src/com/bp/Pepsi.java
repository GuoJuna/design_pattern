package com.bp;

import com.bp.stract.ColdDrink;

/**
 * @author GuoJun
 * @desc 百事可乐
 * @since 2022/4/27 19:19
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百事";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
