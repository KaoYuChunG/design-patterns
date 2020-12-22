package com.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {

    List<College> collegeLsit;

    public OutputImpl(List<College> collegeLsit) {
        this.collegeLsit = collegeLsit;
    }

    public void printCollege() {
        Iterator<College> iterator = collegeLsit.iterator();

        while (iterator.hasNext()) {
            College college =  iterator.next();
            System.out.println("====="+college.getName() +"========");
            printdepartment(college.createIterator());

        }
    }

    public void printdepartment(Iterator iteratora) {
        while (iteratora.hasNext()) {
           Department department = (Department)iteratora.next();
           System.out.println("====="+ department.getName()+"=====");
        }

    }
}
