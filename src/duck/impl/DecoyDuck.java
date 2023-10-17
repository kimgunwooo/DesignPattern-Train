package duck.impl;

import duck.Duck;
import duck.flyBehavior.Impl.FlyNoWay;
import duck.quackBehavior.impl.MuteQuack;

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
