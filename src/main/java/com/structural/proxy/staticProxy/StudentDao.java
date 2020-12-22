package com.structural.proxy.staticProxy;

public class StudentDao implements IDao {
    @Override
    public void teach() {
        System.out.println("student is teached by teacher...");
    }
}
