package com.yuanyang.remotecontroll.command;

import java.util.ArrayList;
import java.util.List;

/**
 * party 关闭命令
 */
public class PartyOffCommand implements Command {

    private List<Command> commands;

    public PartyOffCommand() {
        commands = new ArrayList<>();
    }

    public void addCommand(Command command){
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commands){
            command.execute();
        }
    }
}
