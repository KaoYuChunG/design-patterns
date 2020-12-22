package com.behavioral.visitor.person;

import com.behavioral.visitor.action.Action;

public class Child extends  Person{
    @Override
    public void accept(Action action) {
        action.getChildResult(this);
    }
}
