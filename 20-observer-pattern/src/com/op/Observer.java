package com.op;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/23 18:37
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
