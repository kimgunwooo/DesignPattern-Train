package dp.hf.abstractFactoryPattern.abstractFactory;

import dp.hf.abstractFactoryPattern.abstractProduct.cheese.Cheese;
import dp.hf.abstractFactoryPattern.abstractProduct.clams.Clams;
import dp.hf.abstractFactoryPattern.abstractProduct.dough.Dough;
import dp.hf.abstractFactoryPattern.abstractProduct.pepperoni.Pepperoni;
import dp.hf.abstractFactoryPattern.abstractProduct.sauce.Sauce;
import dp.hf.abstractFactoryPattern.abstractProduct.veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
