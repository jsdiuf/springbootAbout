package com.jsdiuf.designPatten.proxy;

/**
 * @author weicc
 * @create 2018-10-10 9:49
 **/
public class RealyImage implements Image {
    String filename;

    public RealyImage(String filename) {
        this.filename = filename;
        loadFileName();
    }

    private void loadFileName() {
        System.out.println("load image from disk");
    }

    @Override
    public void display() {
        System.out.println("disalpy image" + filename);
    }
}
