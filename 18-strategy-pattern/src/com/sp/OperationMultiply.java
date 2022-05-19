package com.sp;

import com.sp.iface.Strategy;

/**
 * @author GuoJun
 * @desc 乘法
 * @since 2022/5/19 18:40
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
