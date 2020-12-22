package com.behavioral.mediator;

public abstract class Mediator {
    public abstract void register(String colleguename, Collegue collegue);

    public abstract void getMessage(int stateChange,String colleguename);

    public abstract void sendMessage();

}
