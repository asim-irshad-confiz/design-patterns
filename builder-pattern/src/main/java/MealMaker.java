import builder.MealBuilder;
import models.Meal;

/**
 * Created by Asim on 11/7/2018.
 */
public class MealMaker {

    private MealBuilder mealBuilder;

    public MealMaker(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal createMeal() {
        this.mealBuilder.buildMain();
        this.mealBuilder.buildDrink();
        this.mealBuilder.buildDessert();
        return this.mealBuilder.getMeal();
    }
}
