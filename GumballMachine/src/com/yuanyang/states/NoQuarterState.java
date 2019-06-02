package com.yuanyang.states;

/**
 * 没有硬币的情况
 */
public class NoQuarterState implements State {


    private GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you insert a quarter");
        machine.setState(new HasQuarterState(machine));
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry, you have not insert any quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("sorry, you have not insert any quarter");
    }

    @Override
    public void dispense() {
        System.out.println("sorry, you have not insert any quarter");
    }
}
