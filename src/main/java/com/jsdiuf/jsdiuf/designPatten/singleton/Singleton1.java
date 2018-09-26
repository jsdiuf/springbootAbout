package com.jsdiuf.jsdiuf.designPatten.singleton;

/**
 * @author weicc
 * @create 2018-09-26 15:12
 * 饿汉模式
 **/
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }
}
