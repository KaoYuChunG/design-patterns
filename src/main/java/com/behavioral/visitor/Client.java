package com.behavioral.visitor;

import com.behavioral.visitor.action.Fail;
import com.behavioral.visitor.action.Success;
import com.behavioral.visitor.action.Wait;
import com.behavioral.visitor.person.Child;
import com.behavioral.visitor.person.Man;
import com.behavioral.visitor.person.Woman;

public class Client {

    public static void main(String[] args){
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        objectStructure.attach(new Man());
        objectStructure.attach(new Child());

        Success success = new Success();
        objectStructure.display(success);
        System.out.println("=======================");
        Fail fail = new Fail();
        objectStructure.display(fail);

        System.out.println("=======================");
        Wait wait = new Wait();
        objectStructure.display(wait);
    }
}
