package com.structural.flyweight;

public class ConcreteWebSite extends WebSite{

    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("Web Site-->"+ type);
        System.out.println("User is-->"+ user.getName());
    }
}
