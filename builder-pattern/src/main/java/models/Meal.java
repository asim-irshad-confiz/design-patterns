package models;

/**
 * Created by Asim on 11/5/2018.
 */
public class Meal {
    private String main;
    private String drink;
    private String dessert;

    public void setMain(String main) {
        this.main = main;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        return "Main - " + main + " - Drink - " + drink + " - Dessert - " + dessert;
    }
}
