package com.structural.decorator.acessorio;

import com.structural.decorator.Decorator;
import com.structural.decorator.Drink;

public class Mike extends Decorator {
    public Mike(Drink obj) {
        super(obj);
        setDes("Mike");
        setPrice(2.0f);
    }
}
