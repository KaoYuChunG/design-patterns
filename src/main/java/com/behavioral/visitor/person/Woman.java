package com.behavioral.visitor.person;

import com.behavioral.visitor.action.Action;

public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
