package builder;

import models.Meal;

/**
 * Created by Asim on 11/5/2018.
 */
public interface MealBuilder {
    void buildMain();
    void buildDrink();
    void buildDessert();
    Meal getMeal();
}
