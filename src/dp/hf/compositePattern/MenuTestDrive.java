package dp.hf.compositePattern;

import dp.hf.MyHWInfo;
import dp.hf.compositePattern.client.Waitress;
import dp.hf.compositePattern.component.MenuComponent;
import dp.hf.compositePattern.composite.Menu;
import dp.hf.compositePattern.leaf.MenuItem;

public class MenuTestDrive {
    public static void main(String[] args) {
        MyHWInfo.printInfo();
        // mid-level Menu
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");

        // adding mid-level Menus to root-level Menu
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // adding bottom-level Menu to mid-level Menu
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of dinerMenu.add(dessertMenu) course!");
        dinerMenu.add(dessertMenu);

        // adding MenuItems to Menus
        pancakeHouseMenu.add(new MenuItem( "K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem( "Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem( "Blueberry Pancakes", "Pancakes made with fresh blueberries, and blueberry syrup", true, 3.49));
        pancakeHouseMenu.add(new MenuItem( "Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59));

        dinerMenu.add(new MenuItem( "Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinerMenu.add(new MenuItem( "BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinerMenu.add(new MenuItem( "Soup of the day", "A bowl of the soup of the day, with a side of potato salad", false, 3.29));
        dinerMenu.add(new MenuItem( "Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05));
        dinerMenu.add(new MenuItem( "Steamed Veggies and Brown Rice", "A medly of steamed vegetables over brown rice", true, 3.99));
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));
        dessertMenu.add(new MenuItem("Cheesecake", "Creamy New York cheesecake, with a chocolate graham crust", true, 1.99));
        dessertMenu.add(new MenuItem("Sorbet", "A scoop of raspberry and a scoop of lime", true, 1.89));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69));
        cafeMenu.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

        waitress.printVegetarianMenu();
    }
}
