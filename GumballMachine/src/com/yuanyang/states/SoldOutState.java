package com.yuanyang.states;

public class SoldOutState implements State {

    private GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("sorry, there is no gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry, you do not insert any quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("sorry, there is no gumball");
    }

    @Override
    public void dispense() {
        System.out.println("sorry, there is no gumball");
    }
}
