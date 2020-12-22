package com.structural.decorator.acessorio;

import com.structural.decorator.Decorator;
import com.structural.decorator.Drink;

public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDes("Chocolate");
        setPrice(3.0f);
    }
}
