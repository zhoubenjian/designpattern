package createpattern.bp;

/**
 * 建造者模式（Builder Pattern）
 */
public class BuilderPattern {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("--- Veg Meal ---");
        vegMeal.showItems();
        System.out.println("Veg Meal Cost: $" + vegMeal.getCost());

        Meal chickenMeal = mealBuilder.prepareChickenMeal();
        System.out.println("\n--- Chicken Meal ---");
        chickenMeal.showItems();
        System.out.println("Chicken Meal Cost: $" + chickenMeal.getCost());
    }
}
