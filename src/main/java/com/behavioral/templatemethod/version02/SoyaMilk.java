package com.behavioral.templatemethod.version02;

public abstract class SoyaMilk {

    final void make() {
        select();
        if(customerWantCondiments()) {
            addCondiments();
        }
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

    boolean customerWantCondiments() {
        return true;
    }
}
