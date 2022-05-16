package com.cp;

import com.cp.iface.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GuoJun
 * @desc 中间人
 * @since 2022/5/16 18:42
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
