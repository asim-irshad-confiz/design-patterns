package builder;

import models.Meal;

/**
 * Created by Asim on 11/5/2018.
 */
public class AdultMealBuilder implements MealBuilder {

    private Meal meal;
    public AdultMealBuilder() {
        meal = new Meal();
    }
    public void buildMain() {
        meal.setMain("double patty burger");
    }

    public void buildDrink() {
        meal.setDrink("coke");
    }

    public void buildDessert() {
        meal.setDessert("ice-cream");
    }

    public Meal getMeal() {
        return meal;
    }
}
