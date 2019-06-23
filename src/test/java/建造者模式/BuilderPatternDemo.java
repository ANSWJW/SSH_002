package 建造者模式;

/**
 * Created by WJW on 2019/6/23.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("veg Meal");
        vegMeal.showItem();
        System.out.println("total cost:"+vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("non veg Meal");
        nonVegMeal.showItem();
        System.out.println("total cost:"+nonVegMeal.getCost());

    }
}
