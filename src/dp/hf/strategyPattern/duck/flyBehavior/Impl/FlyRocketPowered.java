package dp.hf.strategyPattern.duck.flyBehavior.Impl;

import dp.hf.strategyPattern.duck.flyBehavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
