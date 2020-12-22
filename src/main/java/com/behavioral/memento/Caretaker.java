package com.behavioral.memento;

import java.util.ArrayList;
import java.util.HashMap;

//守護者對象，保存遊戲狀態
public class Caretaker {

    //只保存一次狀態
    private Memento memento;
    //對GameRole保存多次狀態
    private ArrayList<Memento> mementos;
    //對多個遊戲角色保存多個狀態
    private HashMap<String, ArrayList<Memento>> rolesMementos;

    public Caretaker() {
        this.mementos = new ArrayList<Memento>();
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public ArrayList<Memento> getMementos() {
        return mementos;
    }

    public void setMementos(Memento memento) {
        this.mementos.add(memento);
    }
}
