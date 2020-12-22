package com.creational.factorymethod;

import com.creational.factorymethod.order.BJOrderPizza;
import com.creational.factorymethod.order.LDOrderPizza;

public class PizzaStore {
    public static void main(String[] args){

        new BJOrderPizza();
        new LDOrderPizza();
        System.out.println("outlog");
    }
}
