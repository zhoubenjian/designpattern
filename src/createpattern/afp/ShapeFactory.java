package createpattern.afp;

import createpattern.Circle;
import createpattern.Rectangle;
import createpattern.Shape;
import createpattern.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String colorType) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {

        return switch (shapeType) {
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            case "square" -> new Square();
            default -> null;
        };
    }
}
