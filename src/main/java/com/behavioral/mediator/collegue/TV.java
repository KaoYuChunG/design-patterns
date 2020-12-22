package com.behavioral.mediator.collegue;

import com.behavioral.mediator.Collegue;
import com.behavioral.mediator.Mediator;

public class TV extends Collegue {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    public void startTv() {
        System.out.println("====Start TV");
    }

    public void stopTv() {
        System.out.println("====Stop TV ");
        sendMessage(0);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
