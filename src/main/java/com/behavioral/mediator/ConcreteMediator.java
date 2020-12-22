package com.behavioral.mediator;

import com.behavioral.mediator.collegue.Alarm;
import com.behavioral.mediator.collegue.CoffeeMachine;
import com.behavioral.mediator.collegue.Curtains;
import com.behavioral.mediator.collegue.TV;

import java.util.HashMap;

public class ConcreteMediator extends Mediator{

    private HashMap<String, Collegue> collegueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        this.collegueMap = new HashMap<String, Collegue>();
        this.interMap = new HashMap<String, String>();
    }

    @Override
    public void register(String colleguename, Collegue collegue) {
        collegueMap.put(colleguename, collegue);

        if (collegue instanceof Alarm) {
            interMap.put("Alarm", colleguename);
        } else if (collegue instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleguename);
        } else if (collegue instanceof TV) {
            interMap.put("TV", colleguename);
        } else if (collegue instanceof Curtains) {
            interMap.put("Curtains", colleguename);
        }
    }

    @Override
    public void getMessage(int stateChange, String colleguename) {

        if (collegueMap.get(colleguename) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine)(collegueMap.get(interMap.get("CoffeeMachine")))).startCoffee();
                ((TV)(collegueMap.get(interMap.get("TV")))).startTv();
            } else if (stateChange == 1) {
                ((TV)(collegueMap.get(interMap.get("TV")))).stopTv();
            }
        } else if (collegueMap.get(colleguename) instanceof CoffeeMachine) {
            ((Curtains)(collegueMap.get(interMap.get("Curtains")))).upCurtains();
        } else if (collegueMap.get(colleguename) instanceof TV) {

        } else if (collegueMap.get(colleguename) instanceof Curtains) {

        }
    }

    @Override
    public void sendMessage() {
        System.out.println("====collegue"+ collegueMap);
        System.out.println("====inter"+ interMap);
    }
}
