package com.yuanyang;

import java.util.Iterator;

public class Main {


    public static void main(String[] args) {
        MenuComponent allMenu = new Menu("总菜单","总菜单");

        MenuComponent launchMenu = new Menu("午餐菜单", "午餐菜单");
        MenuComponent niupai = new MenuItem("牛排","牛排",false, 12.00f);
        MenuComponent jidan = new MenuItem("鸡蛋","鸡蛋",false, 2.00f);
        MenuComponent huanggua = new MenuItem("黄瓜","黄瓜",true, 1.00f);
        launchMenu.add(niupai);
        launchMenu.add(jidan);
        launchMenu.add(huanggua);

        MenuComponent dinnerMenu = new Menu("晚餐", "晚餐");
        MenuComponent xihongshi = new MenuItem("西红柿", "西红柿", true, 2.00f);
        MenuComponent tudou = new MenuItem("土豆", "土豆", true, 2.00f);
        MenuComponent kaorou = new MenuItem("烤肉", "烤肉", false, 15.00f);
        dinnerMenu.add(xihongshi);
        dinnerMenu.add(tudou);
        dinnerMenu.add(kaorou);

        allMenu.add(launchMenu);
        allMenu.add(dinnerMenu);

        //print all menu items
        allMenu.print();

        System.out.println("----------------------");

        //print all menu items that is vegetarian
        Iterator<MenuComponent> iterator = allMenu.createIterator();
        while (iterator.hasNext()){
            MenuComponent component = iterator.next();
            if (component instanceof MenuItem){
                if (component.isVegetarian()){
                    component.print();
                }
            }
        }

    }
}
