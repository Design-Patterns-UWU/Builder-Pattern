package com.company;

import java.util.ArrayList;

public class MealBuilder {

    private ArrayList<Item> food = new ArrayList<Item>();
    private ArrayList<Item> drink = new ArrayList<Item>();
    private ArrayList<Item> dessert = new ArrayList<Item>();

    public MealBuilder setFood(Item food) {
        this.food.add(food);
        return this;
    }

    public MealBuilder setDrink(Item drink) {
        this.drink.add(drink);
        return this;
    }

    public MealBuilder setDessert(Item dessert) {
        this.dessert.add(dessert);
        return this;
    }

    public Meal prepareVegMeal (){
       return new MealBuilder().setDessert(new IceCream()).setFood(new VegBurger()).setDrink(new Coke()).getMeal();
    }

    public Meal prepareNonVegMeal (){
        return new MealBuilder().setDessert(new Pudding()).setFood(new ChickenBurger()).setDrink(new Pepsi()).getMeal();
    }

    public Meal getMeal(){
        return new Meal(food,drink,dessert);
    }
}
