package com.jsdiuf.designPatten.builder;

/**
 * @author weicc
 * @create 2018-09-26 16:01
 **/
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke Cool";
    }

    @Override
    public float price() {
        return 4.2f;
    }
}
