package dp.hf.iteratorPattern.aggregate;

import dp.hf.iteratorPattern.MenuItem;
import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
