package com.bp;

/**
 * @author GuoJun
 * @desc 套餐建造者
 * @since 2022/4/27 19:25
 */
public class MealBuilder {

    /**
     * 制作蔬菜套餐
     * @return
     */
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 制作鸡肉套餐
     * @return
     */
    public Meal prepareChickBurger(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
