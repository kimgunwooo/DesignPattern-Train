package FlyBehavior.Impl;

import FlyBehavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't Fly");
    }
}
