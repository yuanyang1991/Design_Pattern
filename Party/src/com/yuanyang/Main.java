package com.yuanyang;

public class Main {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new CDPlayer(),new PopcornPopper(),new Screen());

        homeTheaterFacade.on();
    }
}
