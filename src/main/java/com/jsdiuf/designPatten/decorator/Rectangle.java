package com.jsdiuf.designPatten.decorator;

/**
 * @author weicc
 * @create 2018-09-29 15:45
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
