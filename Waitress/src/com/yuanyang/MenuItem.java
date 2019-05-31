package com.yuanyang;

public class MenuItem {

    private String name;

    private boolean isVegetable;

    public MenuItem(String name, boolean isVegetable) {
        this.name = name;
        this.isVegetable = isVegetable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetable() {
        return isVegetable;
    }

    public void setVegetable(boolean vegetable) {
        isVegetable = vegetable;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", isVegetable=" + isVegetable +
                '}';
    }
}
