package com.matthewquinn.decorator;


import com.matthewquinn.component.Pizza;

public abstract class Topping extends Pizza {
    public abstract String getDescription();
}
