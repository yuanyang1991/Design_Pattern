package com.yuanyang;

import com.yuanyang.menu.Menu;

import java.util.Iterator;

public class Waitress {

    private Menu launchMenu;

    private Menu dinnerMenu;

    public Waitress(Menu launchMenu, Menu dinnerMenu) {
        this.launchMenu = launchMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu(){
        System.out.println("print launch menus");
        Iterator<MenuItem> launchIte = launchMenu.createIterator();
        while (launchIte.hasNext()){
            System.out.println(launchIte.next());
        }
        System.out.println("print dinner menus");
        Iterator<MenuItem> dinnerIte = dinnerMenu.createIterator();
        while (dinnerIte.hasNext()){
            System.out.println(dinnerIte.next());
        }
    }
}
