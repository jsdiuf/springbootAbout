package com.jsdiuf.designPatten.abstractFactory;

/**
 * @author weicc
 * @create 2018-09-26 10:43
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
