package strategyPattern.duck.impl;

import strategyPattern.duck.Duck;
import strategyPattern.duck.flyBehavior.Impl.FlyNoWay;
import strategyPattern.duck.quackBehavior.impl.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm DecoyDuck");
    }
}
