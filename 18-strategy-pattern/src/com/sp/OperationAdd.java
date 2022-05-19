package com.sp;

import com.sp.iface.Strategy;

/**
 * @author GuoJun
 * @desc 加法
 * @since 2022/5/19 18:39
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
