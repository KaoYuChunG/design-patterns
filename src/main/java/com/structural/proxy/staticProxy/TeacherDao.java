package com.structural.proxy.staticProxy;

public class TeacherDao implements IDao {
    @Override
    public void teach() {
        System.out.println("teacher teaching...");
    }
}
