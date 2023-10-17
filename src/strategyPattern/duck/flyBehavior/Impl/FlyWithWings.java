package strategyPattern.duck.flyBehavior.Impl;

import strategyPattern.duck.flyBehavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm Flying!!");
    }
}
