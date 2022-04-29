package com.ap;

import com.ap.iface.MediaPlayer;

/**
 * @author GuoJun
 * @desc 实现MediaPlayer接口的实体类
 * @since 2022/4/29 19:09
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("播放 Mp3 :"+fileName);
        }else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else{
            System.out.println("无法播放该类型文件!!!");
        }
    }
}
