package com.jsdiuf.jsdiuf.designPatten.adapter;

/**
 * @author weicc
 * @create 2018-09-27 10:26
 **/
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc"+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
