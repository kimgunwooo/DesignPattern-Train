package dp.hf.strategyPattern.duck.impl;

import dp.hf.strategyPattern.duck.Duck;
import dp.hf.strategyPattern.duck.flyBehavior.Impl.FlyNoWay;
import dp.hf.strategyPattern.duck.quackBehavior.impl.MuteQuack;

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
