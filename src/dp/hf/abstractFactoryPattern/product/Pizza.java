package dp.hf.abstractFactoryPattern.product;

import dp.hf.abstractFactoryPattern.abstractProduct.cheese.Cheese;
import dp.hf.abstractFactoryPattern.abstractProduct.dough.Dough;
import dp.hf.abstractFactoryPattern.abstractProduct.sauce.Sauce;
import dp.hf.abstractFactoryPattern.abstractProduct.veggies.Veggies;

public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies[] veggies;
    public Cheese cheese;

    abstract public void prepare();
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");

    }
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return this.getName();
    }
}
