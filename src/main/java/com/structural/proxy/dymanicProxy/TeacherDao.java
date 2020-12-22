package com.structural.proxy.dymanicProxy;

public class TeacherDao implements IDao {
    @Override
    public void teach() {
        System.out.println("teacher teaching...");
    }

    @Override
    public void hello(String name) {
        System.out.println("saying hello..." + name);
    }
}
