package com.jsdiuf.jsdiuf.designPatten.builder;

/**
 * @author weicc
 * @create 2018-09-26 15:57
 **/
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 20.2f;
    }
}
