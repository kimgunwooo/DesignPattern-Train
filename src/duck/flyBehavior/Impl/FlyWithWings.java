package duck.flyBehavior.Impl;

import duck.flyBehavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm Flying!!");
    }
}
