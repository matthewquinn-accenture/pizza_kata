package com.matthewquinn.decorator;


public class Pepperoni extends Topping {

    @Override
    public String getDescription() {
        return "Pepperoni";
    }

    @Override
    public double cost() {
        return 0;
    }
}
