package com.principls.dependenceinversion;

public class version2 {
    public static void main(String[] args){
        Person2 person = new Person2();
        person.receive(new Email2());
        person.receive(new Google());
    }
}

interface IReceive {
    public String getInfo();
}

class Email2 implements IReceive{
    public String getInfo() {
        return "email";
    }
}

class Google implements IReceive{
    public String getInfo() {
        return "google";
    }
}

class Person2 {
    public void receive(IReceive receive) {
        System.out.println(receive.getInfo());
    }
}
