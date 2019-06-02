package com.yuanyang.states;

/**
 * 幸运者
 */
public class WinnerState implements State {

    private GumballMachine machine;

    public WinnerState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you should not insert quarter at this time");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you should not insert quarter at this time");
    }

    @Override
    public void turnCrank() {
        System.out.println("you should not insert quarter at this time");
    }

    @Override
    public void dispense() {
        int current = machine.release2BallAndGet();
        if (current == 0) {
            machine.setState(new SoldOutState(machine));
        }else {
            machine.setState(new NoQuarterState(machine));
        }
    }
}
