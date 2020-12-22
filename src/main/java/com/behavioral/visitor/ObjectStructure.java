package com.behavioral.visitor;

import com.behavioral.visitor.action.Action;
import com.behavioral.visitor.person.Person;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {

    private List<Person> persons = new LinkedList<>();

    public void attach(Person p) {
        persons.add(p);
    }

    public void detach(Person p) {
        persons.remove(p);
    }

    public void display(Action action) {
        for(Person p: persons) {
            p.accept(action);
        }
    }
}
