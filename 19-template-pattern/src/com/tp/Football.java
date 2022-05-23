package com.tp;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/20 19:11
 */
public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("足球游戏初始化...");
    }

    @Override
    void startPlay() {
        System.out.println("开始足球游戏...");
    }

    @Override
    void endPlay() {
        System.out.println("结束足球游戏...");
    }
}
