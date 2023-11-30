package dp.hf.compositePattern.leaf;

import dp.hf.compositePattern.iterator.NullIterator;
import dp.hf.compositePattern.component.MenuComponent;
import java.util.Iterator;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    // set of getter methods to get access to the fields.

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.print("	" + getName());
        if (this.isVegetarian())
            System.out.println("(v)");
        System.out.println(", " + getPrice());
        System.out.println("	--" + getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
