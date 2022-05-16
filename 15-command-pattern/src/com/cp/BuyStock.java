package com.cp;

import com.cp.iface.Order;
import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/16 18:40
 */
public class BuyStock implements Order {
    private Stock absStock;

    public BuyStock(Stock absStock) {
        this.absStock = absStock;
    }

    @Override
    public void execute() {
        absStock.buy();
    }
}
