package com.jsdiuf.jsdiuf.designPatten.adapter;

/**
 * @author weicc
 * @create 2018-09-27 10:27
 **/
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playing Mp4  "+fileName);
    }
}
