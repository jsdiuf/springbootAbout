package com.jsdiuf.designPatten.builder;

/**
 * @author weicc
 * @create 2018-09-26 15:58
 **/
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chicken Burger";
    }

    @Override
    public float price() {
        return 40.3f;
    }
}
