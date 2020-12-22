package com.creational.factorymethod.order;

import com.creational.factorymethod.pizza.*;

public class LDOrderPizza extends OrderPizza{
    public LDOrderPizza() {
        super.OrderPizza();
    }

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
