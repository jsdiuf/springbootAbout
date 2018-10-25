package com.jsdiuf.designPatten.decorator;

/**
 * @author weicc
 * @create 2018-09-29 15:48
 **/
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decodeShape) {
        super(decodeShape);
    }
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
