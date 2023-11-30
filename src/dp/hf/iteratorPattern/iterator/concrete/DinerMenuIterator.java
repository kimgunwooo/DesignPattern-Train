package dp.hf.iteratorPattern.iterator.concrete;

import dp.hf.iteratorPattern.MenuItem;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position ++;
        return menuItem;
    }
    public boolean hasNext() {
        if (position >= items.length) return false;
        else return true;
    }

    public void remove() {
        throw new UnsupportedOperationException("Can't delete menu items.");
    }
}
