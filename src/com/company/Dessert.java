package com.company;

public abstract class Dessert implements Item{
    @Override
    public String packing() {
        return "Cup";
    }

    @Override
    public abstract float price();
}
