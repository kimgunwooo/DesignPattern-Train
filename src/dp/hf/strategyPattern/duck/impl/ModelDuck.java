package dp.hf.strategyPattern.duck.impl;

import dp.hf.strategyPattern.duck.Duck;
import dp.hf.strategyPattern.duck.flyBehavior.Impl.FlyNoWay;
import dp.hf.strategyPattern.duck.quackBehavior.impl.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model dp.hf.strategyPattern.duck");
    }
}
