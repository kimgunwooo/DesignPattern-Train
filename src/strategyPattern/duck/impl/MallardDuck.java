package strategyPattern.duck.impl;

import strategyPattern.duck.Duck;
import strategyPattern.duck.flyBehavior.Impl.FlyWithWings;
import strategyPattern.duck.quackBehavior.impl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
