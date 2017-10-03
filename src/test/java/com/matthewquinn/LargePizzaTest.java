package com.matthewquinn;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LargePizzaTest {

    private Pizza pizza;

    @Before
    public void setUpLargePizza() throws Exception {
        pizza = new LargePizza();
    }

    @Test
    public void shouldReturnLargePizzaDescription() {
        Assert.assertEquals(pizza.getDescription(),"Large Pizza");
    }

    @Test
    public void shouldCost12NinetyNineForLargePizza() {
        Assert.assertEquals(pizza.cost(),12.99,2);
    }
}
