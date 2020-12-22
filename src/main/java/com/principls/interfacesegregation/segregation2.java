package com.principls.interfacesegregation;

public class segregation2 {

    public static void main(String[] args){
        A2 a = new A2();
        a.depend1(new B2());
        a.depend2(new B2());
        a.depend3(new B2());


    }
}

interface Interface01 {
    void o1();
}

interface Interface02 {
    void o2();
    void o3();
}

interface Interface03 {
    void o4();
    void o5();
}

class B2 implements Interface01, Interface02 {

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


}
class D2 implements Interface01, Interface03 {

    @Override
    public void o1() {
        System.out.println("D1");
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

class A2 {
    public void depend1(Interface01 i) {
        i.o1();
    }
    public void depend2(Interface02 i) {
        i.o2();
    }
    public void depend3(Interface02 i) {
        i.o3();
    }
}

class C2 {
    public void depend1(Interface1 i) {
        i.o1();
    }
    public void depend4(Interface03 i) {
        i.o4();
    }
    public void depend5(Interface03 i) {
        i.o5();
    }
}


