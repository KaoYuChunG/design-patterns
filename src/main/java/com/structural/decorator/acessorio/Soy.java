package com.structural.decorator.acessorio;

import com.structural.decorator.Decorator;
import com.structural.decorator.Drink;

public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes("Soy");
        setPrice(1.5f);
    }
}
