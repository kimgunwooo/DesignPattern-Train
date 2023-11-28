package dp.hf.templateMethodPattern.abstractClass;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) addCondiments();
    }
    protected abstract void brew();
    protected abstract void addCondiments();
    void boilWater() {
        System.out.println("Boiling water");
    }
    void pourInCup () {
        System.out.println("Pouring into cup");
    }
    protected boolean customerWantsCondiments() {
        return true;
    }
}
