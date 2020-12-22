package com.behavioral.templatemethod.version01;

public abstract class SoyaMilk {

    final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    void select() {
        System.out.println("select bean soya");
    }

    abstract void addCondiments();

    void soak() {
        System.out.println("make soya three hours");
    }

    void beat() {
        System.out.println("combina other");
    }
}
