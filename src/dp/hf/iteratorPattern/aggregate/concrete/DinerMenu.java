package dp.hf.iteratorPattern.aggregate.concrete;

import dp.hf.iteratorPattern.MenuItem;
import dp.hf.iteratorPattern.aggregate.Menu;
import dp.hf.iteratorPattern.iterator.concrete.DinerMenuIterator;
import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    public DinerMenu ( ) {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem ("Vegetarian BLT", "Bacon with Lettuce & tomato on whole wheat", true, 2.99);
        addItem ("Soup of the Day", "Soup of the Day with potato salad", false, 3.29);
        addItem ("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem ("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
        addItem ("Steamed Veggies and Brown Rice", "A medly of steamed vegetables over brown rice", true, 3.99);
        addItem ("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89);
// other items
    }
    public void addItem (String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem (name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Sorry menu is full! Can’t add any more items");
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
