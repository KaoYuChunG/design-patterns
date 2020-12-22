package com.behavioral.mediator.collegue;

import com.behavioral.mediator.Collegue;
import com.behavioral.mediator.Mediator;

public class Alarm extends Collegue {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);

        //被創出並加入mediator
        mediator.register(name,this);
    }

    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
