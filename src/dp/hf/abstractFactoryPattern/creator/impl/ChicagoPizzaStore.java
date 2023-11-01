package dp.hf.abstractFactoryPattern.creator.impl;

import dp.hf.abstractFactoryPattern.abstractFactory.PizzaIngredientFactory;
import dp.hf.abstractFactoryPattern.abstractFactory.impl.ChicagoPizzaIngredientFactory;
import dp.hf.abstractFactoryPattern.creator.PizzaStore;
import dp.hf.abstractFactoryPattern.product.Pizza;
import dp.hf.abstractFactoryPattern.product.impl.CheesePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            //pizza = new VeggiePizza(ingredientFactory);
            //pizza.setName("Chicago Style Veggie Pizza");
        } else if (item.equals("clam")) {
            //pizza = new ClamPizza(ingredientFactory);
            //pizza.setName("Chicago Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            //pizza = new PepperoniPizza(ingredientFactory);
            //pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
