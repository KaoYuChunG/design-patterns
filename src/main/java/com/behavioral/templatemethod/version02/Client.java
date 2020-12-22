package com.behavioral.templatemethod.version02;

public class Client {
    public static void main(String[] args){
        System.out.println("====Red bean====");
        SoyaMilk redbeanSoya = new RedSoyaMilk();
        redbeanSoya.make();

        System.out.println("====Pennut bean====");
        SoyaMilk pennutbeanSoya = new PennutSoyaMilk();
        pennutbeanSoya.make();

        System.out.println("====Pure bean====");
        SoyaMilk purebeanSoya = new PureSoyaMilk();
        purebeanSoya.make();
    }
}
