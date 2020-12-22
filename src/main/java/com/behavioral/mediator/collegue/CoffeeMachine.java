package com.behavioral.mediator.collegue;

import com.behavioral.mediator.Collegue;
import com.behavioral.mediator.Mediator;

public class CoffeeMachine extends Collegue {

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    public void startCoffee() {
        System.out.println("====Start coffee");
    }

    public void finishCoffee() {
        System.out.println("====Finish coffee");
        System.out.println("====The coffee is ok!!");
        sendMessage(0);
    }
     public void sendCoffee(int stateChange){
         sendMessage(stateChange);
     }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
