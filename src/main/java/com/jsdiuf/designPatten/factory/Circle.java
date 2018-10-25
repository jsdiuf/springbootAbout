package com.jsdiuf.designPatten.factory;

/**
 * @author weicc
 * @create 2018-09-26 0:06
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
