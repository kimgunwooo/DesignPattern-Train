package dp.hf.strategyPattern.duck.flyBehavior.Impl;

import dp.hf.strategyPattern.duck.flyBehavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't Fly");
    }
}
