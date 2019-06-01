package com.yuanyang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

    private List<MenuComponent> components;

    private String name;

    private String desc;

    public Menu(String name, String desc) {
        this.components = new ArrayList<>();
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void add(MenuComponent component) {
        components.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        components.remove(component);
    }

    @Override
    public MenuComponent getChild(int index) {
        return components.get(index);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return desc;
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new MenuIterator(components.iterator());
    }

    @Override
    public void print() {
        System.out.println("print menu of" + name);
        for (MenuComponent component : components) {
            component.print();
        }
    }
}
