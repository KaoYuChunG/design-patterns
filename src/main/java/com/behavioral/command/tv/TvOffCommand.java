package com.behavioral.command.tv;

import com.behavioral.command.Command;

public class TvOffCommand implements Command {

    private TvReceiver TV;

    public TvOffCommand(TvReceiver TV) {
        this.TV = TV;
    }

    @Override
    public void execute() {
        this.TV.off();
    }

    @Override
    public void undo() {
        this.TV.on();
    }
}
