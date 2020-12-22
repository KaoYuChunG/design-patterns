package com.behavioral.mediator;

public abstract class Collegue {

    private Mediator mediator;
    protected String name;

    public Collegue(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public abstract void sendMessage(int stateChange);
}
