package com.bp.stract;

import com.bp.Wrapper;
import com.bp.iface.Item;
import com.bp.iface.Packing;
/**
 * @author GuoJun
 * @desc 汉堡
 * @since 2022/4/27 19:16
 */
public abstract class Burger implements Item {

    public Packing packing(){
        return new Wrapper();
    }

    public abstract float price();
}
