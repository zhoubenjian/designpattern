package createpattern.afp;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {

        switch (factoryType) {
            case "shape":
                return new ShapeFactory();

            case "color":
                return new ColorFactory();

            default:
                return null;
        }
    }
}
