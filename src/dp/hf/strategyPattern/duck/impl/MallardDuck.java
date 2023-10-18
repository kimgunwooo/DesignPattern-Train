package dp.hf.strategyPattern.duck.impl;

import dp.hf.strategyPattern.duck.Duck;
import dp.hf.strategyPattern.duck.flyBehavior.Impl.FlyWithWings;
import dp.hf.strategyPattern.duck.quackBehavior.impl.Quack;

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
