package strategyPattern.duck.impl;

import strategyPattern.duck.Duck;
import strategyPattern.duck.flyBehavior.Impl.FlyNoWay;
import strategyPattern.duck.quackBehavior.impl.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm Rubber Duck");
    }
}
