package com.yuanyang.remotecontroll.command;

import com.yuanyang.remotecontroll.product.GarageDoor;

/**
 * 打开车库门命令
 */
public class GarageDoorOpenCommand implements Command {

    private GarageDoor door;


    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
