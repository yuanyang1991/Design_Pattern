package com.yuanyang.states;

import com.yuanyang.states.NoQuarterState;
import com.yuanyang.states.SoldOutState;
import com.yuanyang.states.State;

/**
 * 糖果机
 */
public class GumballMachine {

    /**
     * 当前状态
     */
    private State state;

    /**
     * 糖果数量
     */
    private int count;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0){
            state = new NoQuarterState(this);
        }else {
            state = new SoldOutState(this);
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public State getState(){
        return state;
    }

    public void turnCrank(){
        state.turnCrank();
    }

    /**
     * 这个不会被外界调用，当摇杆被摇动的时候，调用次方法
     */
    void dispense(){
        state.dispense();
    }

    public void setState(State state){
        if (state == null) {
            throw new NullPointerException("state can not null !!");
        }
        this.state = state;
    }

    /**
     * 卖出一个糖果后返回剩余糖果
     * @return
     */
    public int decreaseAndGet() {
        return --count;
    }

    /**
     *返回当前糖果数量
     * @return
     */
    public int getCurrentCount(){
        return count;
    }

    public int release2BallAndGet(){
        return count -= 2;
    }
}
