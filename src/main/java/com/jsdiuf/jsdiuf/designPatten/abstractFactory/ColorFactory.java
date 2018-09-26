package com.jsdiuf.jsdiuf.designPatten.abstractFactory;

/**
 * @author weicc
 * @create 2018-09-26 11:18
 **/
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {

        if (null == color) {
            return null;
        }

        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }
        if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }

}
