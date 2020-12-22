package com.behavioral.command.tv;

import com.behavioral.command.Command;

public class TvOnCommand implements Command {

    private TvReceiver TV;

    public TvOnCommand(TvReceiver TV) {
        this.TV = TV;
    }

    @Override
    public void execute() {
        this.TV.on();
    }

    @Override
    public void undo() {
        this.TV.off();
    }
}
