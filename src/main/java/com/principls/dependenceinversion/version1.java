package com.principls.dependenceinversion;

public class version1 {
    public static void main(String[] args){
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "email";
    }
}

class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}