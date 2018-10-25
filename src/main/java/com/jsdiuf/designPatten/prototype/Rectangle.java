package com.jsdiuf.designPatten.prototype;

/**
 * @author weicc
 * @create 2018-09-26 16:41
 **/
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
