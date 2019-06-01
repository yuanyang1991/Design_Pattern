package com.yuanyang;

import java.util.Iterator;

public class MenuItem extends MenuComponent {

    private String name;

    private String desc;

    private boolean isVegetarian;

    private float price;

    public MenuItem(String name, String desc, boolean isVegetarian, float price) {
        this.name = name;
        this.desc = desc;
        this.isVegetarian = isVegetarian;
        this.price = price;
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
    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", isVegetarian=" + isVegetarian +
                ", price=" + price +
                '}';
    }
}
