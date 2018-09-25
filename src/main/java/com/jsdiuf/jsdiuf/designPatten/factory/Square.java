package com.jsdiuf.jsdiuf.designPatten.factory;

/**
 * @author weicc
 * @create 2018-09-26 0:05
 **/
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
