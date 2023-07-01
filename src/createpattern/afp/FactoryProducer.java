package createpattern.afp;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {

        return switch (factoryType) {
            case "shape" -> new ShapeFactory();
            case "color" -> new ColorFactory();
            default -> null;
        };
    }
}
