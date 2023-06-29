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
