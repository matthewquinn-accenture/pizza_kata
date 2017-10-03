package com.matthewquinn.decorator;


import org.junit.Assert;
import org.junit.Test;

public class PepperoniTest {

    @Test
    public void shouldReturnPepperoniDescription() {
        Topping topping = new Pepperoni();
        Assert.assertEquals(topping.getDescription(), "Pepperoni");
    }

    @Test
    public void shouldCost29CentsForPepperoniTopping() {
        Topping topping = new Pepperoni();
        Assert.assertEquals(topping.cost(), .29,-2);
    }
}
