package createpattern.afp;

import createpattern.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(String colorType);
    public abstract Shape getShape(String shapeType);
}
