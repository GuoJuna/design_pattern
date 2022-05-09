package com.bp.iface;
/**
 * @author GuoJun
 * @desc 食物
 * @since 2022/4/27 19:16
 */
public interface Item {

    String name();

    Packing packing();

    float price();
}
