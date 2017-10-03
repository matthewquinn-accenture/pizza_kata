package com.matthewquinn.component;


public class SmallPizza extends Pizza {

    public SmallPizza() {
        description = "Small Pizza";
    }

    @Override
    public double cost() {
        return 7.99;
    }
}
