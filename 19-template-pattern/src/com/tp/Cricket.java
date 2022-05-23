package com.tp;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/20 19:09
 */
public class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("板球游戏初始化...");
    }

    @Override
    void startPlay() {
        System.out.println("开始板球游戏...");
    }

    @Override
    void endPlay() {
        System.out.println("结束板球游戏...");
    }
}
