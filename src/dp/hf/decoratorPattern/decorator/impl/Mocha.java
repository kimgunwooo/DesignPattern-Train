package dp.hf.decoratorPattern.decorator.impl;

import dp.hf.decoratorPattern.component.Beverage;
import dp.hf.decoratorPattern.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    public double cost() {
        return .20 + beverage.cost();
    }
}