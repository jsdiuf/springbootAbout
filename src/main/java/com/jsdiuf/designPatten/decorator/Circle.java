package com.jsdiuf.designPatten.decorator;

/**
 * @author weicc
 * @create 2018-09-29 15:46
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
