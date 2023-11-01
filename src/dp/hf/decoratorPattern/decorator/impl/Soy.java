package dp.hf.decoratorPattern.decorator.impl;

import dp.hf.decoratorPattern.component.Beverage;
import dp.hf.decoratorPattern.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
    public double cost() {
        return .60 + beverage.cost();
    }
}
