package com.matthewquinn;


public class MediumPizza extends Pizza {

    public MediumPizza() {
        description = "Medium Pizza";
    }

    @Override
    public double cost() {
        return 9.99;
    }
}
