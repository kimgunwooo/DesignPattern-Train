package dp.hf.strategyPattern;

import dp.hf.strategyPattern.duck.Duck;
import dp.hf.strategyPattern.duck.flyBehavior.Impl.FlyRocketPowered;
import dp.hf.strategyPattern.duck.impl.DecoyDuck;
import dp.hf.strategyPattern.duck.impl.MallardDuck;
import dp.hf.strategyPattern.duck.impl.ModelDuck;
import dp.hf.strategyPattern.duck.impl.RubberDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MyHWInfo.printInfo();

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        System.out.println();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performQuack();
        rubber.performFly();
        System.out.println();

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();
        decoy.performFly();
        System.out.println();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.performQuack();
    }
}
