package com.yuanyang.remotecontroll.command;


import com.yuanyang.remotecontroll.product.GarageDoor;

/**
 * 关闭车门命令
 */
public class GarageDoorCloseCommand implements Command {

    private GarageDoor door;

    public GarageDoorCloseCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }
}
