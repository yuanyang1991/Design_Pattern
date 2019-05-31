package com.yuanyang.menu;

import com.yuanyang.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 午餐菜单
 */
public class LaunchMenu implements Menu {

    private List<MenuItem> menuItems;

    public LaunchMenu(){
        menuItems = new ArrayList<>();
    }

    @Override
    public void addItem(String name, boolean isVegetable){
        menuItems.add(new MenuItem(name, isVegetable));
    }


    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
