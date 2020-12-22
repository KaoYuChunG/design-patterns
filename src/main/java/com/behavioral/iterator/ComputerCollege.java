package com.behavioral.iterator;

import java.util.Iterator;

public class ComputerCollege implements College{

    private Department[] departments;
    private int oneofDepartemnt = 0;

    public ComputerCollege() {
        this.departments = new Department[5];
        addDepartment("Java class", "Java");
        addDepartment("Python class", "Python");
        addDepartment("Scala class", "Scala");
        addDepartment("Javascript class", "Javascript");
    }

    @Override
    public String getName() {
        return "Computer College";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[oneofDepartemnt] = department;
        oneofDepartemnt += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
