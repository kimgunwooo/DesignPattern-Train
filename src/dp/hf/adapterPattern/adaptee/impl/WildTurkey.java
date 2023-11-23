package dp.hf.adapterPattern.adaptee.impl;

import dp.hf.adapterPattern.adaptee.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
