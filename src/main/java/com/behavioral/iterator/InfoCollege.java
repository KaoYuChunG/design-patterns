package com.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements  College{

    private List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<Department>();
        addDepartment("information segurity", "segurity");
        addDepartment("information spring boot", "sping boot");
        addDepartment("information docker", "docker");
        addDepartment("information jenkins", "jenkins");

    }

    @Override
    public String getName() {
        return "Information College";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
