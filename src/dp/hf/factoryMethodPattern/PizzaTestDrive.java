package dp.hf.factoryMethodPattern;

import dp.hf.MyHWInfo;
import dp.hf.factoryMethodPattern.creator.PizzaStore;
import dp.hf.factoryMethodPattern.creator.impl.ChicagoPizzaStore;
import dp.hf.factoryMethodPattern.creator.impl.NYPizzaStore;
import dp.hf.factoryMethodPattern.product.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        MyHWInfo.printInfo();
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        System.out.println();

        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza2.getName());
    }
}
