package com.jsdiuf.jsdiuf.designPatten.prototype;

/**
 * @author weicc
 * @create 2018-09-26 16:42
 **/
public class Square extends Shape {
    public Square() {
        type="Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
