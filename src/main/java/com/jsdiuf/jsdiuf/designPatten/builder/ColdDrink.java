package com.jsdiuf.jsdiuf.designPatten.builder;

/**
 * @author weicc
 * @create 2018-09-26 15:59
 **/
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing(){
        return new Bottle();
    }
}