package com.jsdiuf.designPatten.singleton;

/**
 * @author weicc
 * @create 2018-09-26 15:20
 **/
public class Singleton4 {
    private static Singleton4 instance;

    static {
        instance = new Singleton4();
    }

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return instance;
    }
}