package com.behavioral.visitor.action;

import com.behavioral.visitor.person.Child;
import com.behavioral.visitor.person.Man;
import com.behavioral.visitor.person.Woman;

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("Man result success");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Woman result success");
    }

    @Override
    public void getChildResult(Child child) {
        System.out.println("Child result success");
    }
}
