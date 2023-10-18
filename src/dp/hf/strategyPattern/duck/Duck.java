package dp.hf.strategyPattern.duck;

import dp.hf.strategyPattern.duck.flyBehavior.FlyBehavior;
import dp.hf.strategyPattern.duck.quackBehavior.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    public Duck() { }
    public abstract void display();
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}