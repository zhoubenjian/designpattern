package createpattern.afp;

import createpattern.Shape;

public class AbstractFactoryPattern {

    public static void main(String[] args) {

        // 获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        // 获取形状为 Circle 的对象
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        // 获取形状为 Rectangle 的对象
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        // 获取形状为 Square 的对象
        Shape square = shapeFactory.getShape("square");
        square.draw();



        // 获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        // 获取颜色为 Red 的对象
        Color red = colorFactory.getColor("red");
        red.fill();

        // 获取颜色为 Green 的对象
        Color green = colorFactory.getColor("green");
        green.fill();

        // 获取颜色为 Blue 的对象
        Color blue = colorFactory.getColor("blue");
        blue.fill();
    }
}
