package com.matthewquinn;


import com.matthewquinn.component.LargePizza;
import com.matthewquinn.component.MediumPizza;
import com.matthewquinn.component.Pizza;
import com.matthewquinn.decorator.Pepperoni;
import org.junit.Assert;
import org.junit.Test;

public class PizzaCostTest {

    @Test
    public void shouldReturnDescriptionOfMediumPepperoniPizza() {
        Pizza pizza = new MediumPizza();
        pizza = new Pepperoni(pizza);

        Assert.assertEquals(pizza.getDescription(), "Medium Pizza with Pepperoni");
    }

    @Test
    public void shouldCost13Dollars28CentsForLargePizzaWithPepperoni() {
        Pizza pizza = new LargePizza();
        pizza = new Pepperoni(pizza);

        Assert.assertEquals(pizza.cost(), 13.28, 2);
    }
}
