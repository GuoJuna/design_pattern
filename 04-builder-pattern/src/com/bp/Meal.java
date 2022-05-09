package com.bp;

import com.bp.iface.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GuoJun
 * @desc 套餐
 * @since 2022/4/27 19:20
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    /**
     * 套餐价值
     * @return
     */
    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        System.out.println("总价:" + cost);
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("条目 : "+item.name());
            System.out.print(", 包装 : "+item.packing().pack());
            System.out.println(", 价钱 : "+item.price());
        }
    }
}
