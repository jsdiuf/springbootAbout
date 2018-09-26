package com.jsdiuf.jsdiuf.designPatten.abstractFactory;

/**
 * @author weicc
 * @create 2018-09-26 11:23
 * http://www.runoob.com/design-pattern/abstract-factory-pattern.html
 **/
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        AbstractFactory shapefactory=FactoryProducer.getFactory("SHAPE");
        Shape shape1=shapefactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2=shapefactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3=shapefactory.getShape("SQUARE");
        shape3.draw();
        System.out.println();
        AbstractFactory colorfactory=FactoryProducer.getFactory("COLOR");

        Color color1=colorfactory.getColor("RED");
        color1.fill();

        Color color2=colorfactory.getColor("BLUE");
        color2.fill();

        Color color3=colorfactory.getColor("GREEN");
        color3.fill();



    }
}
