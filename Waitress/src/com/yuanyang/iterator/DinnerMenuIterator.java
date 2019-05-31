package com.yuanyang.iterator;

import com.yuanyang.MenuItem;

import java.util.Iterator;


public class DinnerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] menuItems;
    private int pos;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        if (pos >= menuItems.length || menuItems[pos] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = menuItems[pos];
        pos++;
        return item;
    }
}
