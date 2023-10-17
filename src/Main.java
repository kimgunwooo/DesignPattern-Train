import strategyPattern.duck.Duck;
import strategyPattern.duck.flyBehavior.Impl.FlyRocketPowered;
import strategyPattern.duck.impl.DecoyDuck;
import strategyPattern.duck.impl.MallardDuck;
import strategyPattern.duck.impl.ModelDuck;
import strategyPattern.duck.impl.RubberDuck;

public class Main {
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