package com.yuanyang.remotecontroll.command;

import com.yuanyang.remotecontroll.product.Light;


/**
 * 开灯命令
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
