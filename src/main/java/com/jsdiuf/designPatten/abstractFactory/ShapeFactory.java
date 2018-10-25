package com.jsdiuf.designPatten.abstractFactory;

/**
 * @author weicc
 * @create 2018-09-26 11:15
 **/
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape==null){
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if (shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if (shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;

    }
}
