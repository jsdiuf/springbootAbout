package com.jsdiuf.jsdiuf.designPatten.decorator;

/**
 * @author weicc
 * @create 2018-09-29 15:46
 **/
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape=decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
