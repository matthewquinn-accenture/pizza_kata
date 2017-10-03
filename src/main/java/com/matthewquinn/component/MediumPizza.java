package com.matthewquinn.component;


public class MediumPizza extends Pizza {

    public MediumPizza() {
        description = "Medium Pizza";
    }

    @Override
    public double cost() {
        return 9.99;
    }
}
