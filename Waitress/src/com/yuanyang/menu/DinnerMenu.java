package com.yuanyang.menu;

import com.yuanyang.MenuItem;
import com.yuanyang.iterator.DinnerMenuIterator;

import java.util.Iterator;

public class DinnerMenu implements Menu {

    private static final int MAX_MENU_SIZE = 6;

    private MenuItem[] menuItems;

    private int pos = 0;

    public DinnerMenu(){
        menuItems = new MenuItem[MAX_MENU_SIZE];
    }

    @Override
    public void addItem(String name, boolean isVegetable){
        if (pos >= MAX_MENU_SIZE) {
            System.out.println("Dinner Menu is full");
        }else {
            menuItems[pos] = new MenuItem(name, isVegetable);
            pos ++;
        }
    }


    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
