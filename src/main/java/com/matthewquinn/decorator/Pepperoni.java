package com.matthewquinn.decorator;


import com.matthewquinn.component.Pizza;

public class Pepperoni extends Topping {

    Pizza pizza;

    public Pepperoni() {
    }

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        if(pizza == null){
            return "Pepperoni";
        }
        return pizza.getDescription() + " with Pepperoni";
    }

    @Override
    public double cost() {
        if(pizza == null){
            return 0.29;
        }
        return pizza.cost() + 0.29;
    }
}
