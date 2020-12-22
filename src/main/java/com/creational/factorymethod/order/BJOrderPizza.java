package com.creational.factorymethod.order;

import com.creational.factorymethod.pizza.BJCheesePizza;
import com.creational.factorymethod.pizza.BJPepperPizza;
import com.creational.factorymethod.pizza.Pizza;


public class BJOrderPizza extends OrderPizza{
    public BJOrderPizza() {
        super.OrderPizza();
    }

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
