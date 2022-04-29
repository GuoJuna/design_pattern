package com.ap;

import com.ap.iface.AdvancedMediaPlayer;

/**
 * @author GuoJun
 * @desc 实现高级播放器
 * @since 2022/4/29 19:02
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放 Vlc :"+fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
