package com.crp;

/**
 * @author GuoJun
 * @desc 错误记录器
 * @since 2022/5/13 18:20
 */
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("错误记录: " + message);
    }
}
