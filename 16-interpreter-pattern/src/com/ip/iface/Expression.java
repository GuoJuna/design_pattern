package com.ip.iface;

/**
 * @author GuoJun
 * @desc 表达式接口
 * @since 2022/5/17 20:33
 */
public interface Expression {
    boolean interpret(String context);
}

