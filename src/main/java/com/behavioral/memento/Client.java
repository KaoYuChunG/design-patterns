package com.behavioral.memento;

public class Client {

    public static void main(String[] args){
        GameRole gameRole = new GameRole();

        gameRole.setDef(100);
        gameRole.setVit(100);

        //一個狀態時
//        System.out.println("=====before the war====");
//        gameRole.display();
//
//        Caretaker caretaker = new Caretaker();
//        caretaker.setMemento(gameRole.createMemento());
//
//        System.out.println("=====during the war=====");
//        gameRole.setDef(30);
//        gameRole.setVit(30);
//
//        gameRole.display();
//
//        System.out.println("=====after the war=====");
//
//        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
//        System.out.println("=====recover=====");
//        gameRole.display();

        //多個狀態時
        System.out.println("=====before the war====");
        gameRole.display();
        Caretaker caretaker = new Caretaker();
        caretaker.setMementos(gameRole.createMemento());

        System.out.println("=====during the war=====");
        gameRole.setDef(30);
        gameRole.setVit(30);
        gameRole.display();
        caretaker.setMementos(gameRole.createMemento());

        System.out.println("=====after the war=====");
        gameRole.recoverGameRoleFromMemento(caretaker.getMementos().get(0));
        gameRole.display();
        caretaker.setMementos(gameRole.createMemento());
        System.out.println("===state--->"+ caretaker.getMementos());

    }
}
