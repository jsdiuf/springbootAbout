package com.jsdiuf.jsdiuf.designPatten.singleton;

/**
 * @author weicc
 * @create 2018-09-26 15:15
 * 懒汉模式  DCL （double-checked locking）
 **/
public class Singleton2 {
    private volatile static Singleton2 singleton;
    private Singleton2 (){}
    public static Singleton2 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton2.class) {
                if (singleton == null) {
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
}
