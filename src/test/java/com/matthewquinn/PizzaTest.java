package com.matthewquinn;


import org.junit.Assert;
import org.junit.Test;

public class PizzaTest {

    @Test
    public void pizzaShouldReturnDescription() {
        Pizza pizza = new Pizza();
        Assert.assertEquals(pizza.getDescription(), "Unknown Pizza");
    }
}
