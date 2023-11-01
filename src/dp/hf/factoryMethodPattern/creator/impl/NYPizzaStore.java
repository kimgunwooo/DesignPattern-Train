package dp.hf.factoryMethodPattern.creator.impl;

import dp.hf.factoryMethodPattern.creator.PizzaStore;
import dp.hf.factoryMethodPattern.product.Pizza;
import dp.hf.factoryMethodPattern.product.impl.NYStyleCheesePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            //pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
