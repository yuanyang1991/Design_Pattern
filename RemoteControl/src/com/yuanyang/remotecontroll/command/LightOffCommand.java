package com.yuanyang.remotecontroll.command;

import com.yuanyang.remotecontroll.product.Light;


/**
 * 关灯命令
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
