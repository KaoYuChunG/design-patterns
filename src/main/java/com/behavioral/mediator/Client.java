package com.behavioral.mediator;

import com.behavioral.mediator.collegue.Alarm;
import com.behavioral.mediator.collegue.CoffeeMachine;
import com.behavioral.mediator.collegue.Curtains;
import com.behavioral.mediator.collegue.TV;

public class Client {

    public static void main(String[] args){
        Mediator mediator = new ConcreteMediator();

        //create object add into the mediator
        Alarm alarm = new Alarm(mediator,"alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
        Curtains curtains = new Curtains(mediator, "curtains" );
        TV tv = new TV(mediator,"TV");

        System.out.println("==================");
        alarm.sendAlarm(0);
        System.out.println("==================");
        coffeeMachine.finishCoffee();
        System.out.println("==================");
        alarm.sendAlarm(1);

        System.out.println("==================");
        coffeeMachine.sendCoffee(0);

        mediator.sendMessage();

    }
}
