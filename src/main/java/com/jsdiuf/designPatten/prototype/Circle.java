package com.jsdiuf.designPatten.prototype;

/**
 * @author weicc
 * @create 2018-09-26 16:43
 **/
public class Circle extends Shape {
    public Circle() {
        type="Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
