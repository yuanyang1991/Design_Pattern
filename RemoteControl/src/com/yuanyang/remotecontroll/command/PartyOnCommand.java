package com.yuanyang.remotecontroll.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合命令。
 *
 * 名字原本是想做成party模式的，这里就用电灯跟车库门代替吧
 */
public class PartyOnCommand implements Command {

    /**
     * 组合的命令
     */
    private List<Command> commands;


    public PartyOnCommand(){
        commands = new ArrayList<>();
    }

    /**
     * 向组合命令中添加命令
     * @param command
     */
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
