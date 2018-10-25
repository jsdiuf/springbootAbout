package com.jsdiuf.designPatten.bridge;

/**
 * @author weicc
 * @create 2018-09-27 18:00
 **/
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
