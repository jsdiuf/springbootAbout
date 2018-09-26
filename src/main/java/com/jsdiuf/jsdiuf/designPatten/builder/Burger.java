package com.jsdiuf.jsdiuf.designPatten.builder;

/**
 * @author weicc
 * @create 2018-09-26 15:55
 **/
public abstract class Burger implements Item {
    @Override
    public Packing packing(){
        return new Wrapper();
    }
}
