package com.jsdiuf.designPatten.bridge;

/**
 * @author weicc
 * @create 2018-09-27 18:01
 **/
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
