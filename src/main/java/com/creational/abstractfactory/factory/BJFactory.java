package com.creational.abstractfactory.factory;

import com.creational.abstractfactory.pizza.BJCheesePizza;
import com.creational.abstractfactory.pizza.BJPepperPizza;
import com.creational.abstractfactory.pizza.Pizza;

public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
