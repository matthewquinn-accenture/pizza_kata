package com.matthewquinn.decorator;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PepperoniTest {

    private Topping topping;

    @Before
    public void setUpTopping() throws Exception {
        topping = new Pepperoni();
    }

    @Test
    public void shouldReturnPepperoniDescription() {
        Assert.assertEquals(topping.getDescription(), "Pepperoni");
    }

    @Test
    public void shouldCost29CentsForPepperoniTopping() {
        Assert.assertEquals(topping.cost(), .29,-2);
    }
}
