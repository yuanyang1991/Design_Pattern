package com.yuanyang;

import com.yuanyang.menu.DinnerMenu;
import com.yuanyang.menu.LaunchMenu;
import com.yuanyang.menu.Menu;

public class Main {

    public static void main(String[] args) {
        Menu launchMenu = new LaunchMenu();
        launchMenu.addItem("niupai", false);
        launchMenu.addItem("shala", true);

        Menu dinnerMenu = new DinnerMenu();
        dinnerMenu.addItem("jidan", false);
        dinnerMenu.addItem("huanggua", true);

        Waitress waitress = new Waitress(launchMenu, dinnerMenu);
        waitress.printMenu();
    }
}
