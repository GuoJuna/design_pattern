package com.crp;

/**
 * @author GuoJun
 * @desc 记录类实体
 * @since 2022/5/13 18:18
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("信息记录: " + message);
    }
}
