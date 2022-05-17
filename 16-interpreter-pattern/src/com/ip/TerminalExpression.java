package com.ip;

import com.ip.iface.Expression;

/**
 * @author GuoJun
 * @desc 实现类
 * @since 2022/5/17 20:34
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
