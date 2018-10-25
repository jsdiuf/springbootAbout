package com.jsdiuf.designPatten.bridge;

/**
 * @author weicc
 * @create 2018-09-27 18:01
 **/
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}