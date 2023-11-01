package dp.hf.abstractFactoryPattern.product.impl;

import dp.hf.abstractFactoryPattern.abstractFactory.PizzaIngredientFactory;
import dp.hf.abstractFactoryPattern.product.Pizza;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

        System.out.println("dough : " + dough.toString());
        System.out.println("sauce : " + sauce.toString());
        System.out.println("cheese : " + cheese.toString());
    }
}
