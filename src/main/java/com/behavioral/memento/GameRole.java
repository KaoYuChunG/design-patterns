package com.behavioral.memento;

import java.util.ArrayList;

public class GameRole {

    private int vit;
    private int def;

    //創建Memento，即根據當前狀態得到Memento
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    //從備忘對象恢復GAMEROLE狀態
    public void recoverGameRoleFromMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    public void display() {
        System.out.println("====VIT--->"+ this.vit);
        System.out.println("====DEF--->"+ this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
