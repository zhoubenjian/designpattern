package createpattern.fp;

import createpattern.Circle;
import createpattern.Rectangle;
import createpattern.Shape;
import createpattern.Square;

public class ShapeFactory {

    public Shape getShape(String shapeType) {

        return switch (shapeType) {
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            case "square" -> new Square();
            default -> null;
        };
    }
}
