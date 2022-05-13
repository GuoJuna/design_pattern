package com.crp;

/**
 * @author GuoJun
 * @desc 文件记录器
 * @since 2022/5/13 18:21
 */
public class FileLogger extends AbstractLogger{

    public FileLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("文件记录: " + message);
    }
}
