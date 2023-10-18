package dp.hf.strategyPattern.duck.quackBehavior.impl;

import dp.hf.strategyPattern.duck.quackBehavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }
}
