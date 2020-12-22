package com.creational.abstractfactory.factory;

import com.creational.abstractfactory.pizza.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
