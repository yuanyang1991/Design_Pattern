package com.yuanyang.remotecontroll;

import com.yuanyang.remotecontroll.command.Command;
import com.yuanyang.remotecontroll.command.LightOnCommand;
import com.yuanyang.remotecontroll.command.NoCommand;

/**
 * 遥控器抽象
 *
 * 遥控器有三拍按钮
 *
 * 每排按钮有 “开” 和 "关“ 两个按钮
 *
 *
 * 让遥控器可以实现开关灯，开关车门，组合开关等功能
 *
 */
public class RemoteControl {

    private static final int CONTROL_SIZE = 4;

    /**
     * 所有打开命令
     */
    private Command[] onCommands;

    /**
     * 所有关闭命令
     */
    private Command[] offCommands;


    public RemoteControl(){
        onCommands = new Command[CONTROL_SIZE];
        offCommands = new Command[CONTROL_SIZE];

        /**
         * 先将所有按钮用NoCommand填充
         */
        for (int i = 0 ; i <CONTROL_SIZE ; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 设置命令给遥控器
     * @param slot    设置给第 slot 排按钮
     * @param onCommand  打开按钮命令
     * @param offCommand  关闭命令
     */
    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * 当硬件被点击后，调用此方法
     * @param slot
     */
    public void onButtonOnClicked(int slot){
        onCommands[slot].execute();
    }

    public void onButtonOffClicked(int slot){
        offCommands[slot].execute();
    }
}
