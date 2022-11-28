package com.company;

public abstract class Drink implements Item {

    @Override
    public String packing() {
        return "Bottle";
    }

    @Override
    public abstract float price();
}
