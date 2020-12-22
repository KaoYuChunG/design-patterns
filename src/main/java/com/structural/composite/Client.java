package com.structural.composite;

public class Client {

    public static void main(String[] args){

        OrganizationComponent university = new University("UEL","estatual");

        OrganizationComponent modaCollege = new College("Design","moda");
        OrganizationComponent heathCollege = new College("heath","medicine");

        modaCollege.add(new Department("desig grafica","2D"));
        modaCollege.add(new Department("arte","plastica"));

        heathCollege.add(new Department("physiotherapy","prevention"));
        heathCollege.add(new Department("psychology","brain"));

        university.add(modaCollege);
        university.add(heathCollege);

        university.print();

    }
}
