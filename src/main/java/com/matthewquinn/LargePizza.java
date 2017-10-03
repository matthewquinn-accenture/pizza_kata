package com.matthewquinn;


public class LargePizza extends Pizza {

    public LargePizza() {
        description = "Large Pizza";
    }

    @Override
    public double cost() {
        return 12.99;
    }
}
