package dp.hf.strategyPattern.duck.impl;

import dp.hf.strategyPattern.duck.Duck;
import dp.hf.strategyPattern.duck.flyBehavior.Impl.FlyNoWay;
import dp.hf.strategyPattern.duck.quackBehavior.impl.Squeak;

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
