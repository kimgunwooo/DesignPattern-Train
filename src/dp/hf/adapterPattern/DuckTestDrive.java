package dp.hf.adapterPattern;

import dp.hf.MyHWInfo;
import dp.hf.adapterPattern.adaptee.impl.WildTurkey;
import dp.hf.adapterPattern.adapter.TurkeyAdapter;
import dp.hf.adapterPattern.target.Duck;
import dp.hf.adapterPattern.target.impl.MallardDuck;

public class DuckTestDrive {
    public static void main(String[] args) {
        MyHWInfo.printInfo();
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);


        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
