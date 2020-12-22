package com.behavioral.command;

public class RemoteController {

    private Command[] onCommands;
    private Command[] offCommands;

    private Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for(int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setOnCommands(int on, Command onCommand, Command offCommand) {
        onCommands[on] = onCommand;
        offCommands[on] = offCommand;
    }

    public void onButtonWasPushed(int on) {
        onCommands[on].execute();
        undoCommand = onCommands[on];
    }

    public void offButtonWasPushed(int on) {
        offCommands[on].execute();
        undoCommand = offCommands[on];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
