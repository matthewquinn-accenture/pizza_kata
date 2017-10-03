package com.matthewquinn.component;


import com.matthewquinn.component.MediumPizza;
import com.matthewquinn.component.Pizza;
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

    @Test
    public void shouldCost9NinteyNineForMediumPizza() {
        Assert.assertEquals(pizza.cost(), 9.99, 2);
    }
}
