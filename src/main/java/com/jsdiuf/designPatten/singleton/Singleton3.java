package com.jsdiuf.designPatten.singleton;

/**
 * @author weicc
 * @create 2018-09-26 15:17
 * 静态内部类
 **/
public class Singleton3 {
    private static class SingletonHolder {
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
