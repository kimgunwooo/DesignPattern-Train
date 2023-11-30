package dp.hf.iteratorPattern;

import dp.hf.MyHWInfo;
import dp.hf.iteratorPattern.aggregate.concrete.DinerMenu;
import dp.hf.iteratorPattern.aggregate.concrete.PancakeHouseMenu;
import dp.hf.iteratorPattern.client.Waitress;

public class MenuTestDrive {
    public static void main(String[] args) {
        MyHWInfo.printInfo();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        // With iterators
        System.out.println("[All Menu]");
        waitress.printMenu();

        System.out.println();

        System.out.println("[Vegetarian Menu]");
        waitress.printVegetarianMenu();
    }
}
