package com.ap;

import com.ap.iface.AdvancedMediaPlayer;

/**
 * @author GuoJun
 * @desc 实现高级播放器
 * @since 2022/4/29 19:04
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放 Mp4 :"+fileName);
    }
}
