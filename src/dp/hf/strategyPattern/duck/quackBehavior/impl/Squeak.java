package dp.hf.strategyPattern.duck.quackBehavior.impl;

import dp.hf.strategyPattern.duck.quackBehavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
