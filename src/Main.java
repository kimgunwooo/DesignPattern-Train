import duck.Duck;
import duck.impl.MallardDuck;

public class Main {
    public static void main(String[] args) {
        MyHWInfo.printInfo();

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

    }
}