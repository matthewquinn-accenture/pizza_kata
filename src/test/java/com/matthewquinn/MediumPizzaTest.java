package com.matthewquinn;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MediumPizzaTest {

    private Pizza pizza;

    @Before
    public void setUpMediumPizza() throws Exception {
        pizza = new MediumPizza();
    }

    @Test
    public void shouldReturnMediumPizzaDescription () {
        Assert.assertEquals(pizza.getDescription(), "Medium Pizza");
    }
}
