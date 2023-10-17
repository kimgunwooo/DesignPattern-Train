package duck.impl;

import duck.Duck;
import duck.flyBehavior.Impl.FlyNoWay;
import duck.quackBehavior.impl.MuteQuack;
import duck.quackBehavior.impl.Squeak;

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
