package com.jsdiuf.jsdiuf.designPatten.abstractFactory;

/**
 * @author weicc
 * @create 2018-09-26 11:11
 **/
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
