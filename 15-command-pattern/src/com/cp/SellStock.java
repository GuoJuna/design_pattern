package com.cp;

import com.cp.iface.Order;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/16 18:41
 */
public class SellStock implements Order {
    private Stock absStock;

    public SellStock(Stock absStock) {
        this.absStock = absStock;
    }

    @Override
    public void execute() {
        absStock.sell();
    }
}
