package com.cp;

/**
 * @author GuoJun
 * @desc 仓库
 * @since 2022/5/16 18:36
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("购买 [名称: " + name + ", 数量: " + quantity + "]");
    }

    public void sell(){
        System.out.println("卖出 [名称: " + name + ", 数量: " + quantity + "]");
    }
}
