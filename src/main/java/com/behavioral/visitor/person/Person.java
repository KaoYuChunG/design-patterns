package com.behavioral.visitor.person;

import com.behavioral.visitor.action.Action;

public abstract class Person {

    public abstract void accept(Action action);
}
