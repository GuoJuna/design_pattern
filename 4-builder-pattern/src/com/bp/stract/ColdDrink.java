package com.bp.stract;

import com.bp.Bottle;
import com.bp.iface.Item;
import com.bp.iface.Packing;

public abstract class ColdDrink implements Item {

    public Packing packing(){
        return new Bottle();
    }

    public abstract float price();
}
