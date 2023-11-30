package dp.hf.compositePattern.iterator;

import dp.hf.compositePattern.component.MenuComponent;
import dp.hf.compositePattern.composite.Menu;
import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) // 타입이 Menu라면? == 디렉터리 == 하위에 또 존재
                stack.push(component.createIterator()); // 그 메뉴에 대한 iterator를 스택에 추가.
            return component; // 다음 값 반환
        }
        else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) { return false; } // 다음 항목이 없음 == 하위에 존재하지 않음.
        Iterator<MenuComponent> iterator = stack.peek(); // 스택 확인
        if (!iterator.hasNext()) { // 더이상 다음 항목이 없다면 == 파일이라면
            stack.pop(); // 스택에서 제거
            return hasNext(); // 이전 Iterator로 이동하면서 다음 가능한 항목이 있는지 재귀적으로 검사
        }
        else {
            return true;
        }
    }


}
