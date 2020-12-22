package com.principls.interfacesegregation;


public class segregation1 {

    public static void main(String[] args){



    }
}

interface Interface1 {
    void o1();
    void o2();
    void o3();
    void o4();
    void o5();
}

class B implements Interface1 {

    @Override
    public void o1() {
        System.out.println("B1");
    }

    @Override
    public void o2() {
        System.out.println("B2");
    }

    @Override
    public void o3() {
        System.out.println("B3");
    }

    @Override
    public void o4() {
        System.out.println("B4");
    }

    @Override
    public void o5() {
        System.out.println("B5");
    }
}
class D implements Interface1 {

    @Override
    public void o1() {
        System.out.println("D1");
    }

    @Override
    public void o2() {
        System.out.println("D2");
    }

    @Override
    public void o3() {
        System.out.println("D3");
    }

    @Override
    public void o4() {
        System.out.println("D4");
    }

    @Override
    public void o5() {
        System.out.println("D5");
    }
}

class A {
    public void depend1(Interface1 i) {
        i.o1();
    }
    public void depend2(Interface1 i) {
        i.o2();
    }
    public void depend3(Interface1 i) {
        i.o3();
    }
}

class C {
    public void depend1(Interface1 i) {
        i.o1();
    }
    public void depend4(Interface1 i) {
        i.o4();
    }
    public void depend5(Interface1 i) {
        i.o5();
    }
}
