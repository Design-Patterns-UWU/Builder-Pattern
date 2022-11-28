package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        Meal meal = new MealBuilder().setDessert(new Coke()).setFood(new ChickenBurger()).setDrink(new Coke()).getMeal();
//        System.out.println(meal.getCost());
//        meal.showItems();

        Meal meal2 = new MealBuilder().prepareVegMeal();
        System.out.println(meal2.getCost());
        meal2.showItems();

    }
}
