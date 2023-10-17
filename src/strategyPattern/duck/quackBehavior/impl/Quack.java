package strategyPattern.duck.quackBehavior.impl;

import strategyPattern.duck.quackBehavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
