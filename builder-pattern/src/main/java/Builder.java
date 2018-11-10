import builder.AdultMealBuilder;
import builder.KidsMealBuilder;
import builder.MealBuilder;
import models.Meal;

/**
 * Created by Asim on 11/7/2018.
 */
public class Builder {

    public static void main(String[] args) {
        boolean isKid = true;
        MealBuilder mealBuilder;
        if(isKid)
            mealBuilder = new KidsMealBuilder();
        else
            mealBuilder = new AdultMealBuilder();
        MealMaker mealMaker = new MealMaker(mealBuilder);
        Meal meal = mealMaker.createMeal();
        System.out.println(meal);
    }
}
