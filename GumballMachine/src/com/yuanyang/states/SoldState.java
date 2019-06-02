package com.yuanyang.states;

/**
 * 售出状态
 */
public class SoldState implements State {

    private GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("sorry, you have inserted any quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry, you should not eject any quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("sorry, you have turn cranked");
    }

    @Override
    public void dispense() {
        System.out.println("dispose gumball");
        int count = machine.decreaseAndGet();
        if (count == 0){
            machine.setState(new SoldOutState(machine));
        }else {
            machine.setState(new NoQuarterState(machine));
        }

    }
}
