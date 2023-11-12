package dp.hf.singletonPattern;

import dp.hf.MyHWInfo;

public class ChocolateController {
    public static void main(String[] args) {
        MyHWInfo.printInfo();

        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        // will return the existing instance
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();

        boiler.fill();
        boiler2.reportBoilerState();
        boiler.boil();
        boiler2.reportBoilerState();
        boiler.drain();
        boiler2.reportBoilerState();
    }
}
