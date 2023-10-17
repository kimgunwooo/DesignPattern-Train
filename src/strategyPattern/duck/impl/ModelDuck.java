package strategyPattern.duck.impl;

import strategyPattern.duck.Duck;
import strategyPattern.duck.flyBehavior.Impl.FlyNoWay;
import strategyPattern.duck.quackBehavior.impl.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model strategyPattern.duck");
    }
}
