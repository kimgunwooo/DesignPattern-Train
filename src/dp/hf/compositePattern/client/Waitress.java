package dp.hf.compositePattern.client;

import dp.hf.compositePattern.component.MenuComponent;
import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    public void printMenu() {
        allMenus.print();
    }
    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("VEGETARIAN MENU-------");
        int counter = 0;
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian())
                    menuComponent.print();
            } catch (UnsupportedOperationException e) {

            }
        }

    }
} // public class Waitress