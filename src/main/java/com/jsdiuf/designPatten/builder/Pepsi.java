package com.jsdiuf.designPatten.builder;

/**
 * @author weicc
 * @create 2018-09-26 16:00
 **/
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 4.0f;
    }
}
