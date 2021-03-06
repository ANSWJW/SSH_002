package _04_建造者模式;

import _04_建造者模式.pojo.ChickenBufger;
import _04_建造者模式.pojo.Coke;
import _04_建造者模式.pojo.Pepsi;
import _04_建造者模式.pojo.VegBurger;

/**
 * Created by WJW on 2019/6/23.
 */
public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }


    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBufger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
