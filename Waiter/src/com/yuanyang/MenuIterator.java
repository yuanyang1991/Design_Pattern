package com.yuanyang;

import java.util.Iterator;
import java.util.Stack;

public class MenuIterator implements Iterator<MenuComponent> {

    private Stack<Iterator<MenuComponent>> stack;

    public MenuIterator(Iterator<MenuComponent> iterator) {
        stack = new Stack<>();
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()){
            return false;
        }
        Iterator<MenuComponent> ite = stack.peek();
        if (ite.hasNext()){
            return true;
        }else {
            stack.pop();
            return hasNext();
        }
    }

    @Override
    public MenuComponent next() {
        Iterator<MenuComponent> ite = stack.peek();
        MenuComponent component = ite.next();
        if (component instanceof Menu){
            stack.add(component.createIterator());
        }
        return component;
    }
}
