package com.jsdiuf.designPatten.proxy;

/**
 * @author weicc
 * @create 2018-10-10 9:48
 **/
public interface Image {
    default void f1(){
        System.out.println("11111");
    }
    void display();
}
