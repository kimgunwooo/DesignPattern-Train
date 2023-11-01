package dp.hf.decoratorPattern.component.impl;

import dp.hf.decoratorPattern.component.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }
    public double cost() {
        return 3.0;
    }
}
