package dp.hf.abstractFactoryPattern.creator.impl;

import dp.hf.abstractFactoryPattern.abstractFactory.PizzaIngredientFactory;
import dp.hf.abstractFactoryPattern.abstractFactory.impl.NYPizzaIngredientFactory;
import dp.hf.abstractFactoryPattern.creator.PizzaStore;
import dp.hf.abstractFactoryPattern.product.Pizza;
import dp.hf.abstractFactoryPattern.product.impl.CheesePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            //pizza = new VeggiePizza(ingredientFactory);
            //pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            //pizza = new ClamPizza(ingredientFactory);
            //pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            //pizza = new PepperoniPizza(ingredientFactory);
            //pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
