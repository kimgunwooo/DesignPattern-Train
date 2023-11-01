package dp.hf.abstractFactoryPattern.abstractFactory.impl;

import dp.hf.abstractFactoryPattern.abstractFactory.PizzaIngredientFactory;
import dp.hf.abstractFactoryPattern.abstractProduct.cheese.Cheese;
import dp.hf.abstractFactoryPattern.abstractProduct.cheese.impl.ShreddedMozzarellaCheese;
import dp.hf.abstractFactoryPattern.abstractProduct.clams.Clams;
import dp.hf.abstractFactoryPattern.abstractProduct.clams.impl.FrozenClams;
import dp.hf.abstractFactoryPattern.abstractProduct.dough.Dough;
import dp.hf.abstractFactoryPattern.abstractProduct.dough.impl.ExtraThickCrustDough;
import dp.hf.abstractFactoryPattern.abstractProduct.pepperoni.Pepperoni;
import dp.hf.abstractFactoryPattern.abstractProduct.pepperoni.impl.SlicedPepperoni;
import dp.hf.abstractFactoryPattern.abstractProduct.sauce.Sauce;
import dp.hf.abstractFactoryPattern.abstractProduct.sauce.impl.PlumTomatoSauce;
import dp.hf.abstractFactoryPattern.abstractProduct.veggies.Veggies;
import dp.hf.abstractFactoryPattern.abstractProduct.veggies.impl.Garlic;
import dp.hf.abstractFactoryPattern.abstractProduct.veggies.impl.Mushroom;
import dp.hf.abstractFactoryPattern.abstractProduct.veggies.impl.Onion;
import dp.hf.abstractFactoryPattern.abstractProduct.veggies.impl.RedPepper;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ExtraThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ShreddedMozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(),
                new RedPepper() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
