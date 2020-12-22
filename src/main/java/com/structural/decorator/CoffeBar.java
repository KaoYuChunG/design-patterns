package com.structural.decorator;

import com.structural.decorator.acessorio.Chocolate;
import com.structural.decorator.acessorio.Mike;
import com.structural.decorator.coffe.Decaf;
import com.structural.decorator.coffe.LongBlack;

public class CoffeBar {
    public static void main(String[] args){

        System.out.println("======LongBlack=========");
        Drink order = new LongBlack();
        System.out.println("valor:" + order.cost());
        System.out.println("descricao:" + order.getDes());

        System.out.println("======Mais Mike=========");
        order = new Mike(order);
        System.out.println("+ mike valor:" + order.cost());
        System.out.println("+ mike descricao:" + order.getDes());

        System.out.println("======Mais Chocolate=========");
        order = new Chocolate(order);
        System.out.println("+ Chocolate valor: " + order.cost());
        System.out.println("+ Chocolate descricao: " + order.getDes());

        System.out.println("========================");

        Drink order2 = new Decaf();
        System.out.println(" Decaf valor: " + order2.cost());
        System.out.println("Decaf descricao: " + order2.getDes());


    }
}
