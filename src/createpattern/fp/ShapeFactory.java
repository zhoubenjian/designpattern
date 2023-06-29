package createpattern.fp;

import createpattern.Circle;
import createpattern.Rectangle;
import createpattern.Shape;
import createpattern.Square;

public class ShapeFactory {

    public Shape getShape(String shapeType) {

        switch (shapeType) {
            case "circle":
                return new Circle();

            case "rectangle":
                return new Rectangle();

            case "square":
                return new Square();

            default:
                return null;
        }
    }
}
