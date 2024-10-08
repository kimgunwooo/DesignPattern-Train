package dp.hf.decoratorPattern.decorator;

import dp.hf.decoratorPattern.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
}
