package com.jsdiuf.jsdiuf.designPatten.bridge;

/**
 * @author weicc
 * @create 2018-09-27 18:02
 **/
public class Circle extends Shape{
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
