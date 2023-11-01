package dp.hf.decoratorPattern.component.impl;

import dp.hf.decoratorPattern.component.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }
    public double cost() {
        return 2.2;
    }
}
