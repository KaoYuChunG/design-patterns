package com.behavioral.visitor.action;

import com.behavioral.visitor.person.Child;
import com.behavioral.visitor.person.Man;
import com.behavioral.visitor.person.Woman;

public abstract class Action {

    public abstract void getManResult(Man man);
    public abstract void getWomanResult(Woman woman);
    public abstract void getChildResult(Child child);
}
