package com.matthewquinn;


import org.junit.Assert;
import org.junit.Test;

public class LargePizzaTest {

    @Test
    public void shouldCost12NinetyNineForLargePizza() {
        Pizza pizza = new LargePizza();
        Assert.assertEquals(pizza.cost(),12.99,2);
    }

    @Test
    public void shouldReturnLargePizzaDescription() {
        Pizza pizza = new LargePizza();
        Assert.assertEquals(pizza.getDescription(),"Large Pizza");
    }
}
