package com.yuanyang.states;

/**
 * 状态抽象
 */
public interface State {

    /**
     * 投入25美分
     */
    void insertQuarter();

    /**
     * 退出25美分
     */
    void ejectQuarter();

    /**
     * 摇动摇杆
     */
    void turnCrank();

    /**
     * 方法糖果
     */
    void dispense();


}
