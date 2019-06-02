package com.yuanyang.main;

import com.yuanyang.states.GumballMachine;

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
        while (gumballMachine.getCurrentCount() > 0){
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            System.out.println(gumballMachine.getCurrentCount());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
