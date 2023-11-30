package dp.hf.compositePattern.iterator;

import dp.hf.compositePattern.component.MenuComponent;
import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
