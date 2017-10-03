package com.matthewquinn;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PizzaTest {

    private Pizza pizza;

    @Before
    public void setUpPizza() throws Exception {
        pizza = new Pizza();
    }

    @Test
    public void shouldReturnPizzaDescription() {
        Assert.assertEquals(pizza.getDescription(), "Unknown Pizza");
    }

    @Test
    public void shouldCalculatePizzaCost() {
        Assert.assertEquals(pizza.cost(), 0, 0);
    }

}
