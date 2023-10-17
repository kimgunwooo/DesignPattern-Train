package duck.impl;

import duck.Duck;
import duck.flyBehavior.Impl.FlyNoWay;
import duck.quackBehavior.impl.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }
}
