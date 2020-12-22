package com.behavioral.mediator.collegue;

import com.behavioral.mediator.Collegue;
import com.behavioral.mediator.Mediator;

public class Curtains extends Collegue {
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);

        mediator.register(name,this);
    }

    public void upCurtains() {
        System.out.println("====up Curtains");
    }

    public void downCurtains() {
        System.out.println("====down Curtains ");
    }

    @Override
    public void sendMessage(int stateChange) {

    }
}
