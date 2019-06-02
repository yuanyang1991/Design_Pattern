package com.yuanyang.states;

import java.util.Map;
import java.util.Random;

public class HasQuarterState implements State {

    private GumballMachine machine;

    private Random random;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
        this.random = new Random();
    }

    @Override
    public void insertQuarter() {
        System.out.println("you have insert a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("eject quarter");
        machine.setState(new NoQuarterState(machine));
    }

    @Override
    public void turnCrank() {
        System.out.println("you have turn crank");
        if (isWinner()) {
            System.out.println("you are winner");
            machine.setState(new WinnerState(machine));
        }else {
            machine.setState(new SoldState(machine));
        }
        machine.dispense();
    }

    /**
     * 判断当前是否幸运用户
     * @return
     */
    private boolean isWinner() {
        return machine.getCurrentCount() >1 && random.nextBoolean();
    }

    @Override
    public void dispense() {

    }
}
