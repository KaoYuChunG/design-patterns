package com.behavioral.visitor.person;

import com.behavioral.visitor.action.Action;

public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
