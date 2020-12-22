package com.creational.abstractfactory;

import com.creational.abstractfactory.factory.BJFactory;
import com.creational.factorymethod.order.BJOrderPizza;
import com.creational.factorymethod.order.LDOrderPizza;

public class PizzaStore {
    public static void main(String[] args){
        new OrderPizza(new BJFactory());
    }
}
