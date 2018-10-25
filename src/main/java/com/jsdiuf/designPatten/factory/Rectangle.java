package com.jsdiuf.designPatten.factory;

/**
 * @author weicc
 * @create 2018-09-26 0:04
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
