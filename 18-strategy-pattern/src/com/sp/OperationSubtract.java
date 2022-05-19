package com.sp;

import com.sp.iface.Strategy;

/**
 * @author GuoJun
 * @desc 减法
 * @since 2022/5/19 18:41
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
