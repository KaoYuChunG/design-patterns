package com.behavioral.command;

import com.behavioral.command.light.LightOffCommand;
import com.behavioral.command.light.LightOnCommand;
import com.behavioral.command.light.LightReceiver;
import com.behavioral.command.tv.TvOffCommand;
import com.behavioral.command.tv.TvOnCommand;
import com.behavioral.command.tv.TvReceiver;

public class Client {
    public static void main(String[] args){
        LightReceiver light = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        RemoteController remote = new RemoteController();

        remote.setOnCommands(0, lightOnCommand, lightOffCommand);

        System.out.println("-------On light------");
        remote.onButtonWasPushed(0);
        System.out.println("-------Off light------");
        remote.offButtonWasPushed(0);
        System.out.println("-------undo light------");
        remote.undoButtonWasPushed();

        System.out.println("-------Remote controller of TV------");
        TvReceiver tv = new TvReceiver();
        TvOnCommand tvOnCommand = new TvOnCommand(tv);
        TvOffCommand tvOffCommand = new TvOffCommand(tv);
        remote.setOnCommands(1, tvOnCommand, tvOffCommand);

        System.out.println("-------On TV------");
        remote.onButtonWasPushed(1);
        System.out.println("-------Off TV------");
        remote.offButtonWasPushed(1);
        System.out.println("-------undo TV------");
        remote.undoButtonWasPushed();
    }
}
