package com.jsdiuf.designPatten.abstractFactory;

/**
 * @author weicc
 * @create 2018-09-26 10:44
 **/
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
