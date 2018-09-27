package com.jsdiuf.jsdiuf.designPatten.adapter;

/**
 * @author weicc
 * @create 2018-09-27 10:28
 **/
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancePlay;

    public MediaAdapter(String type) {
        if(type.equalsIgnoreCase("vlc")){
            advancePlay=new VlcPlayer();
        }else if (type.equalsIgnoreCase("mp4")){
            advancePlay=new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")){
            advancePlay.playVlc(fileName);
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancePlay.playMp4(fileName);
        }
    }
}
