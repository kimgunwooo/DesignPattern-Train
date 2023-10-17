package strategyPattern.duck.quackBehavior.impl;

import strategyPattern.duck.quackBehavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }
}
