package com.matthewquinn.component;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SmallPizzaTest {

    private Pizza pizza;

    @Before
    public void setUpSmallPizza() throws Exception {
        pizza = new SmallPizza();
    }

    @Test
    public void shouldReturnSmallPizzaDescription() {
        Assert.assertEquals(pizza.getDescription(), "Small Pizza");
    }

    @Test
    public void shouldCost7NinteyNineForSmallPizza() {
        Assert.assertEquals(pizza.cost(), 7.99,2);
    }
}
