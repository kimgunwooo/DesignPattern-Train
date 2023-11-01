package dp.hf.decoratorPattern;

import dp.hf.MyHWInfo;
import dp.hf.decoratorPattern.component.Beverage;
import dp.hf.decoratorPattern.component.impl.DarkRoast;
import dp.hf.decoratorPattern.component.impl.Espresso;
import dp.hf.decoratorPattern.component.impl.HouseBlend;
import dp.hf.decoratorPattern.decorator.impl.Mocha;
import dp.hf.decoratorPattern.decorator.impl.Soy;
import dp.hf.decoratorPattern.decorator.impl.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        MyHWInfo.printInfo();

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());


        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}