package com.company;
import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> food = new ArrayList<Item>();
    private ArrayList<Item> drink = new ArrayList<Item>();
    private ArrayList<Item> dessert = new ArrayList<Item>();

    public Meal(ArrayList<Item> food, ArrayList<Item> drink, ArrayList<Item> dessert) {
        this.food = food;
        this.drink = drink;
        this.dessert = dessert;
    }

    public float getCost(){
        food.addAll(drink);
        food.addAll(dessert);
        float cost = 0.0f;
        for (Item item : food) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        int cnt=1;
        for (Item item : food) {
            System.out.print("Item "+cnt+": " + item.name());
            System.out.print(", Packing : " + item.packing());
            System.out.println(", Price : " + item.price());
            cnt++;
        }
    }


}
