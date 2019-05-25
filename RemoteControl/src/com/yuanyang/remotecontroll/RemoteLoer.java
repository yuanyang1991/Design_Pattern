package com.yuanyang.remotecontroll;

import com.yuanyang.remotecontroll.command.*;
import com.yuanyang.remotecontroll.product.GarageDoor;
import com.yuanyang.remotecontroll.product.Light;

public class RemoteLoer {

    public static void main(String[] args) {

        //厨房电灯
        Light light = new Light("kitChen");

        //卧室电灯
        Light liveRoomLight = new Light("Living Room");


        GarageDoor garageDoor = new GarageDoor();

        Command kitChanLightOnCommand = new LightOnCommand(light);
        Command kitChanLightOffCommand = new LightOffCommand(light);

        Command livingRoomLightOffCommand = new LightOffCommand(liveRoomLight);
        Command livingRoomLightOnCommand = new LightOnCommand(liveRoomLight);

        Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        Command garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        PartyOnCommand partyOnCommand = new PartyOnCommand();
        partyOnCommand.addCommand(kitChanLightOnCommand);
        partyOnCommand.addCommand(livingRoomLightOnCommand);
        partyOnCommand.addCommand(garageDoorOpenCommand);


        PartyOffCommand partyOffCommand = new PartyOffCommand();
        partyOffCommand.addCommand(kitChanLightOffCommand);
        partyOffCommand.addCommand(livingRoomLightOffCommand);
        partyOffCommand.addCommand(garageDoorCloseCommand);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0,kitChanLightOnCommand,kitChanLightOffCommand);
        remoteControl.setCommand(1,livingRoomLightOnCommand,livingRoomLightOffCommand);
        remoteControl.setCommand(2,garageDoorOpenCommand,garageDoorCloseCommand);
        remoteControl.setCommand(3,partyOnCommand,partyOffCommand);


        /**
         *
         * 以下是模拟点击
         */
        remoteControl.onButtonOffClicked(0);
        remoteControl.onButtonOffClicked(1);
        remoteControl.onButtonOffClicked(2);
        remoteControl.onButtonOffClicked(3);


        remoteControl.onButtonOnClicked(0);
        remoteControl.onButtonOnClicked(1);
        remoteControl.onButtonOnClicked(2);
        remoteControl.onButtonOnClicked(3);






    }
}
