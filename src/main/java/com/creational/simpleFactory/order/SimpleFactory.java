package com.creational.simpleFactory.order;

import com.creational.simpleFactory.pizza.CheesePizza;
import com.creational.simpleFactory.pizza.GreekPizza;
import com.creational.simpleFactory.pizza.PepperPizza;
import com.creational.simpleFactory.pizza.Pizza;

public class SimpleFactory {

    public Pizza createPizza(String orderType) {

        Pizza pizza = null;
        System.out.println("Simple factory");
        if(orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if(orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        } else if(orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("pepper");
        }
        return pizza;
    }
}
