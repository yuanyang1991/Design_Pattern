package com.yuanyang;

import java.util.Iterator;

/**
 * 一个空实现的iterator
 */
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
