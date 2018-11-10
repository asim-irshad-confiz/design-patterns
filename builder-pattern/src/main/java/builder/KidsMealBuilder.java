package builder;

import models.Meal;

/**
 * Created by Asim on 11/7/2018.
 */
public class KidsMealBuilder implements MealBuilder {

    private Meal meal;
    public KidsMealBuilder() {
        meal = new Meal();
    }
    public void buildMain() {
        meal.setMain("single patty burger");
    }

    public void buildDrink() {
        meal.setDrink("juice");
    }

    public void buildDessert() {
        meal.setDessert("ice-cream");
    }

    public Meal getMeal() {
        return meal;
    }
}
