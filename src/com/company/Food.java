package com.company;

public abstract class Food implements Item {

    @Override
    public String packing() {
        return "Wrapper";
    }

    @Override
    public abstract float price();
}