package dp.hf.decoratorPattern.decorator.impl;

import dp.hf.decoratorPattern.component.Beverage;
import dp.hf.decoratorPattern.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
    public double cost() {
        return .40 + beverage.cost();
    }
}
