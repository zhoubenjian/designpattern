package createpattern.afp;

import createpattern.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String colorType) {

        return switch (colorType) {
            case "red" -> new Red();
            case "green" -> new Green();
            case "blue" -> new Blue();
            default -> null;
        };
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
