package createpattern.afp;

import createpattern.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String colorType) {

        switch (colorType) {
            case "red":
                return new Red();

            case "green":
                return new Green();

            case "blue":
                return new Blue();

            default:
                return null;
        }
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
